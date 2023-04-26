package com.soft.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
	private int Stud_ID;
	private String Stud_Name;
	private String Stud_Dept;
	
   @OneToMany(mappedBy = "student")
	private List<Address> addressList;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int stud_ID, String stud_Name, String stud_Dept, List<Address> addressList) {
	super();
	Stud_ID = stud_ID;
	Stud_Name = stud_Name;
	Stud_Dept = stud_Dept;
	this.addressList = addressList;
}

public int getStud_ID() {
	return Stud_ID;
}

public void setStud_ID(int stud_ID) {
	Stud_ID = stud_ID;
}

public String getStud_Name() {
	return Stud_Name;
}

public void setStud_Name(String stud_Name) {
	Stud_Name = stud_Name;
}

public String getStud_Dept() {
	return Stud_Dept;
}

public void setStud_Dept(String stud_Dept) {
	Stud_Dept = stud_Dept;
}

public List<Address> getAddressList() {
	return addressList;
}

public void setAddressList(List<Address> addressList) {
	this.addressList = addressList;
}

@Override
public String toString() {
	return "Student [Stud_ID=" + Stud_ID + ", Stud_Name=" + Stud_Name + ", Stud_Dept=" + Stud_Dept + "]";
}


   


}
