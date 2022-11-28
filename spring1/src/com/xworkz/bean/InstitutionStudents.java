package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InstitutionStudents {

	@Autowired
	private String studentNames;
	@Autowired
	private double institutionFee;

	public double getInstitutionFee() {
		return institutionFee;
	}

	public String getStudentName() {
		return studentNames;
	}

}
