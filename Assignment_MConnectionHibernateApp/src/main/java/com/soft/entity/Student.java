package com.soft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Record")
public class Student {
	
	@Id
	private int ID;
	private String Name;
	private String Email;
	private String Address;
	private long MobiNumber;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int iD, String name, String email, String address, long mobiNumber) {
		super();
		ID = iD;
		Name = name;
		Email = email;
		Address = address;
		MobiNumber = mobiNumber;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobiNumber() {
		return MobiNumber;
	}
	public void setMobiNumber(long mobiNumber) {
		MobiNumber = mobiNumber;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", MobiNumber="
				+ MobiNumber + "]";
	}
	
	
	

}
