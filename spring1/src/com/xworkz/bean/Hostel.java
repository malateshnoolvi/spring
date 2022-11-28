package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hostel {
	@Autowired
	private int noOfHostelStudents;
	@Autowired
	private String hostelType;
	@Autowired
	private HostelWarden warden;

	public int getNoOfStudents() {
		return noOfHostelStudents;
	}

	public String getType() {
		return hostelType;
	}

	public void display() {
		System.out.println(warden.getWardenAge());
		System.out.println(warden.getWardenName());
	}
}
