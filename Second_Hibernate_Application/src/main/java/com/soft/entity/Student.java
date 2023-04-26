package com.soft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_Details")
public class Student {
	
	@Id
	@Column(name="Stud_ID")
	private int ID;
	@Column(name="Stud_Name")
	private String Name;
	@Column(name="Stud_Address")
    private  String Address;
	@Column(name="Stud_Divison")
	private String Division;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int iD, String name, String address, String division) {
		super();
		ID = iD;
		Name = name;
		Address = address;
		Division = division;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Division=" + Division + "]";
	}
	
	
}
