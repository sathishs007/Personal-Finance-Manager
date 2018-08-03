package com.syntel.hackathon.model;

import javax.persistence.*;

import org.bson.types.ObjectId;
import org.mockito.internal.invocation.SerializableMethod;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "user")
@Document(collection = "user")
public class User extends Basic  implements Serializable{
    private ObjectId id;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String nationality;
    private String address;
    private Double mobileno;
    
    private LicenceDetails licDetails;
    private BankAccountDetails bankDetails;
    

//    private Set<Role> roles;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getMobileno() {
		return mobileno;
	}

	public void setMobileno(Double mobileno) {
		this.mobileno = mobileno;
	}

	public LicenceDetails getLicDetails() {
		return licDetails;
	}

	public void setLicDetails(LicenceDetails licDetails) {
		this.licDetails = licDetails;
	}

	public BankAccountDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankAccountDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	

    
}
