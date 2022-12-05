package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class President {
	@Value("Droupadi murmu")

	private String name;
	@Value("64")
	private int age;
	@Autowired
	@Qualifier("presidentSalary")
	private Salary salary;
	@Value("Chif Of The Indian Armed")
	private String expertise;
	@Autowired
	@Qualifier("presidentEducation")
	private Education education;

	
	public President(String name, int age, Salary salary, String expertise, Education education) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.expertise = expertise;
		this.education = education;
	}

	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + ", salary=" + salary + ", expertise=" + expertise
				+ ", education=" + education + "]";
	}
}
