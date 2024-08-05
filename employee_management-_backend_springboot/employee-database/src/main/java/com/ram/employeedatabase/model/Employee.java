package com.ram.employeedatabase.model;

public class Employee {

	public int id;
	public String firstName;
	public String lastName;
//	public String fatherName;
//	
//	public String getFatherName() {
//		return fatherName;
//	}
//
//	public void setFatherName(String fatherName) {
//		this.fatherName = fatherName;
//	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
}
