package com.soft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address_Details")
public class Address {
	@Id
	private int AddressID;
	private int Pincode;
	private String City;
	private String State;
	
	@ManyToOne
	private Student student;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressID, int pincode, String city, String state, Student student) {
		super();
		AddressID = addressID;
		Pincode = pincode;
		City = city;
		State = state;
		this.student = student;
	}

	public int getAddressID() {
		return AddressID;
	}

	public void setAddressID(int addressID) {
		AddressID = addressID;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [AddressID=" + AddressID + ", Pincode=" + Pincode + ", City=" + City + ", State=" + State
				+ ", student=" + student + "]";
	}
	
	
	
	

}
