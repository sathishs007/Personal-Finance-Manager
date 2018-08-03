package com.syntel.hackathon.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
public class Car {

  private String id;

  private String make;

  private String model;
  
  private int year;

  private String description;

  public Car() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setModel(String model) {
    this.model = model;
  }

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

}