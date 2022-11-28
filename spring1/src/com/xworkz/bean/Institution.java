package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Institution {
	@Autowired
	private String institutionName;
	@Autowired
	private Integer institutionRent;
	@Autowired
	private InstitutionStudents students;

	public String getInstitutionName() {
		return institutionName;
	}

	public Integer getInstitutionRent() {
		return institutionRent;
	}

	public void display() {
		System.out.println(students.getInstitutionFee());
		System.out.println(students.getStudentName());
	}

}
