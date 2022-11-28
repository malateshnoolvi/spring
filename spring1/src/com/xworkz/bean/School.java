package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Autowired
	private String schoolName;
	@Autowired
	private int noOfStudents;
	@Autowired
	private SchoolStudent student;

	public String getSchoolName() {
		return schoolName;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void diplay() {
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentAge());
	}

}
