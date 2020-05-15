package com.vedika.functionhall.model;



public class FunctionHallUIResponse {

	private String functionHallName;
	private String ownerFirstName;
	private String ownerLastName;
	private String ownerId;

	private String street;
	private String state;
	private String city;
	private int zipcode;
	
	private String imageurl;

	public String getFunctionHallName() {
		return functionHallName;
	}

	public void setFunctionHallName(String functionHallName) {
		this.functionHallName = functionHallName;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	@Override
	public String toString() {
		return "FunctionHallUIResponse [functionHallName=" + functionHallName + ", ownerFirstName=" + ownerFirstName
				+ ", ownerLastName=" + ownerLastName + ", ownerId=" + ownerId + ", street=" + street + ", state="
				+ state + ", city=" + city + ", zipcode=" + zipcode + ", imageurl=" + imageurl + "]";
	}
		
}