package com.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid;
	private String sname;

	private List<String> listofcourse = new ArrayList<String>();

	private Set<Integer> listofrollnumbers = new HashSet<Integer>();

	private Map<String, Integer> listofstudentmarks = new HashMap<String, Integer>();

	
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


	public List<String> getListofcourse() {
		return listofcourse;
	}


	public void setListofcourse(List<String> listofcourse) {
		this.listofcourse = listofcourse;
	}


	public Set<Integer> getListofrollnumbers() {
		return listofrollnumbers;
	}


	public void setListofrollnumbers(Set<Integer> listofrollnumbers) {
		this.listofrollnumbers = listofrollnumbers;
	}


	public Map<String, Integer> getListofstudentmarks() {
		return listofstudentmarks;
	}


	public void setListofstudentmarks(Map<String, Integer> listofstudentmarks) {
		this.listofstudentmarks = listofstudentmarks;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", listofcourse=" + listofcourse + ", listofrollnumbers="
				+ listofrollnumbers + ", listofstudentmarks=" + listofstudentmarks + "]";
	}

}
