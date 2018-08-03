package com.syntel.hackathon.model;

import org.bson.types.ObjectId;

public class LicenceDetails {
	

    private String drivingLicenceNumber;
    private String ssn;
    private String vehicleMake;
    private String vehicleModel;
    private String drivingInsuranceDetails;
    private String truckCapacity;
    private String truckDimensions;
	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}
	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getVehicleMake() {
		return vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getDrivingInsuranceDetails() {
		return drivingInsuranceDetails;
	}
	public void setDrivingInsuranceDetails(String drivingInsuranceDetails) {
		this.drivingInsuranceDetails = drivingInsuranceDetails;
	}
	public String getTruckCapacity() {
		return truckCapacity;
	}
	public void setTruckCapacity(String truckCapacity) {
		this.truckCapacity = truckCapacity;
	}
	public String getTruckDimensions() {
		return truckDimensions;
	}
	public void setTruckDimensions(String truckDimensions) {
		this.truckDimensions = truckDimensions;
	}
    
    

}
