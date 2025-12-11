package com.model;

public class Faculty {

	private int facultyId;

	private String facultyName;

	private String facultyAddress;

	private double facultyMobileNo;

	private String facultyEmailID;

	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFacultyAddress() {
		return facultyAddress;
	}

	public void setFacultyAddress(String facultyAddress) {
		this.facultyAddress = facultyAddress;
	}

	public double getFacultyMobileNo() {
		return facultyMobileNo;
	}

	public void setFacultyMobileNo(double facultyMobileNo) {
		this.facultyMobileNo = facultyMobileNo;
	}

	public String getFacultyEmailID() {
		return facultyEmailID;
	}

	public void setFacultyEmailID(String facultyEmailID) {
		this.facultyEmailID = facultyEmailID;
	}

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyAddress=" + facultyAddress
				+ ", facultyMobileNo=" + facultyMobileNo + ", facultyEmailID=" + facultyEmailID + ", course=" + course
				+ "]";
	}

}
