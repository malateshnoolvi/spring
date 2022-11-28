package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	private String collegeName;
	@Autowired
	private int noOfStudents1;
	@Autowired
	private CollegePrincipal principal;

	public String getCollegeName() {
		return collegeName;
	}

	public int getNoOfStudents() {
		return noOfStudents1;
	}
	public void display() {
		System.out.println(principal.getPrincipalName());
		System.out.println(principal.getPrincipalEducation());
	}

}
