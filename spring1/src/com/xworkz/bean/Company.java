package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private String companyName;
	@Autowired
	private int noOfEmployees;
	@Autowired
	private CompanyEmployees employees;

	public String getCompanyName() {
		return companyName;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void display() {
		System.out.println(employees.getEmployeeName());
		System.out.println(employees.getEmployeeAge());
	}

}
