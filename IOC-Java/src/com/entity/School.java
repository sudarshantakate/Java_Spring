package com.entity;

public class School {

	private int sid;

	private String sname;

	private String Address;
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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
		return "School [sid=" + sid + ", sname=" + sname + ", Address=" + Address + "]";
	}
	
	
}
