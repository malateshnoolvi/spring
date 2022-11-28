package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private String mobileName;
	@Autowired
	private int mobilePrice;
	@Autowired
	private MobileType type;

	public String getMobileName() {
		return mobileName;
	}

	public int getMobilePrice() {
		return mobilePrice;
	}

	public void display() {
		System.out.println(type.getMobileCompany());
		System.out.println(type.getMobileSize());
	}

}
