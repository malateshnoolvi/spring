package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bakery {

	@Autowired
	private String bakeryName;
	@Autowired
	private double rent;
	@Autowired
	private BakerySweet sweet;

	public String getBakeryName() {
		return bakeryName;
	}

	public double getRent() {
		return rent;
	}

	public void display() {
		System.out.println(sweet.getSweetName());
		System.out.println(sweet.getSweetPrice());
	}

}
