package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VicePresident extends President {
	

	@Value("Jagdeep Dhankar")
	private String vicePrsidentName;
	@Value("71")
	private int age;
	@Autowired
	@Qualifier("vicePresidentSalary")
	private Salary salary;
	@Value("governor of west bengal")
	private String expertice;
	@Autowired
	@Qualifier("vicePresidentEducation")
	private Education education;
	

	public VicePresident(String name, int age, Salary salary, String expertise, Education education) {
		super(name, age, salary, expertise, education);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VicePresident [vicePrsidentName=" + vicePrsidentName + ", age=" + age + ", salary=" + salary
				+ ", expertice=" + expertice + ", education=" + education + "]";
	}

}
