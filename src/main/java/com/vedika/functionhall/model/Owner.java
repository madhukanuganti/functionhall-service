package com.vedika.functionhall.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "functionhall_reference_data")
public class Owner {
	@Id
	private String id;

	private String firstName;

	private String lastName;
	

	private String city;

	private String state;

	private String zipCode;

	private String email;
	private long phonenumber;
	private String address1;
	private String address2;
	


	private List<FunctionHall> functionhall;



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
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



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}



	public String getAddress1() {
		return address1;
	}



	public void setAddress1(String address1) {
		this.address1 = address1;
	}



	public String getAddress2() {
		return address2;
	}



	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	public List<FunctionHall> getFunctionhall() {
		return functionhall;
	}



	public void setFunctionhall(List<FunctionHall> functionhall) {
		this.functionhall = functionhall;
	}



	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", email=" + email + ", phonenumber=" + phonenumber + ", address1="
				+ address1 + ", address2=" + address2 + ", functionhall=" + functionhall + "]";
	}

	
}