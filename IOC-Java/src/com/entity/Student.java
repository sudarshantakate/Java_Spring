package com.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rollNo;
	
	private String sname;
	
	private String Address;
	
	@Autowired(required = false)
	private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + ", Address=" + Address + ", school=" + school + "]";
	}
	
	
}
