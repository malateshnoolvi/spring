package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Founder {

	private String nameOfFounder;
	private int age;
	private String gender;
	@Autowired
	private boolean isMarried;
	@Autowired
	private boolean isBusinessMan;

	public Founder(String nameOfFounder, int age) {
		System.out.println("created parameter constructor of founder");
		this.nameOfFounder = nameOfFounder;
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Founder [nameOfFounder=" + nameOfFounder + ", age=" + age + ", gender=" + gender + ", isMarried="
				+ isMarried + ", isBusinessMan=" + isBusinessMan + "]";
	}

}
