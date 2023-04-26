package com.soft.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	private List<Student> stdList;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressID, int pincode, String city, String state, List<Student> stdList) {
		super();
		AddressID = addressID;
		Pincode = pincode;
		City = city;
		State = state;
		this.stdList = stdList;
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

	public List<Student> getStdList() {
		return stdList;
	}

	public void setStdList(List<Student> stdList) {
		this.stdList = stdList;
	}

	@Override
	public String toString() {
		return "Address [AddressID=" + AddressID + ", Pincode=" + Pincode + ", City=" + City + ", State=" + State
				+ ", stdList=" + stdList + "]";
	}

	

}
