package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	@Autowired
	private String busNo;
	@Autowired
	private double price;

	public String getBusNo() {
		return busNo;
	}

	public double getPrice() {
		return price;
	}
}
