package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Judge {

	private String name;
	private int age;
	private boolean experince;
	@Autowired
	@Qualifier("education")
	private String education;
	@Autowired
	private double salary;

	public Judge(String name, int age) {
		System.out.println("created parameter constructor of judge");
		this.name = name;
		this.age = age;
	}

	public void setExperince(boolean experince) {
		this.experince = experince;
	}

	@Override
	public String toString() {
		return "Judge [name=" + name + ", age=" + age + ", experince=" + experince + ", education=" + education
				+ ", salary=" + salary + "]";
	}

}
