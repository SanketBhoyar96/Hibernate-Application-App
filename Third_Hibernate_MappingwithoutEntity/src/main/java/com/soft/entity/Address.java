package com.soft.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int Pincode;
	private String City;
	private String State;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String city, String state) {
		super();
		Pincode = pincode;
		City = city;
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	@Override
	public String toString() {
		return "Address [Pincode=" + Pincode + ", City=" + City + ", State=" + State + "]";
	}
	
	

}
