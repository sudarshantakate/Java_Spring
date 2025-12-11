package com.model;

public class Student {

	private int studentId;

	private String studentName;

	private String studentAddress;

	private double studentMobileNo;

	private String studentEmailId;

	private Batch batch;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public double getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(double studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentEmailId() {
		return studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentMobileNo=" + studentMobileNo + ", studentEmailId=" + studentEmailId + ", batch=" + batch
				+ "]";
	}
}
