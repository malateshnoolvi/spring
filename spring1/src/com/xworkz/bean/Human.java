package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
	@Autowired
	private String humanName;
	@Autowired
	private String humantype;
	@Autowired
	private Heart heart;

	public String getHumanName() {
		return humanName;
	}

	public String getType() {
		return humantype;
	}

	public void display() {
		System.out.println(heart.getBloodPump());
		System.out.println(heart.getColour());

	}

}
