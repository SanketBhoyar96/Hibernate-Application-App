package com.soft.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_Details")
public class Employee {
	@Id
	private int EmpID;
	private String EmpName;
	private String EmpDep;
	private int EmpSalary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String empName, String empDep, int empSalary) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpDep = empDep;
		EmpSalary = empSalary;
	}
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDep() {
		return EmpDep;
	}
	public void setEmpDep(String empDep) {
		EmpDep = empDep;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpDep=" + EmpDep + ", EmpSalary=" + EmpSalary
				+ "]";
	}
	
	

	

}
