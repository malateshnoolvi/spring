package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopDress {
	@Autowired
	private String brand;
	@Autowired
	private double dressPrice;

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return dressPrice;
	}

}
