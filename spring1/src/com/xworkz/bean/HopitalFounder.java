package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HopitalFounder {
	@Autowired
	private String founderName;
	@Autowired
	private int age;

	public String getFounderName() {
		return founderName;
	}

	public int getAge() {
		return age;
	}

}
