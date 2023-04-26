package com.soft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emploee_Details")
public class Employee {
	
	@Id
	@Column(name="Emp_ID")
	private int ID;
	@Column(name="Emp_Name")
	private String Name;
	@Column(name="Emp_Address")
	private String Address;
	@Column(name="Emp_Salary")
	private int Salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int iD, String name, String address, int salary) {
		super();
		ID = iD;
		Name = name;
		Address = address;
		Salary = salary;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Salary=" + Salary + "]";
	}
   
	
	
}
