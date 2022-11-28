package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	@Autowired
	private String barName;
	@Autowired
	private String address;
	@Autowired
	private BarOwner barOwner;

	public String getBarName() {
		return barName;
	}

	public String getAddress() {
		return address;
	}

	public void display() {
		System.out.println(barOwner.getBarOwnerName());
		System.out.println(barOwner.getBarOwnerAge());
	}
}
