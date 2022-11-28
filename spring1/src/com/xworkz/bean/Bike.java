package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	@Autowired
	private String bikeBrand;
	@Autowired
	private double bikePrice;
	@Autowired
	private BikeHonda honda;

	public String getBikeBrand() {
		return bikeBrand;
	}

	public double getBikePrice() {
		return bikePrice;
	}

	public void display() {
		System.out.println(honda.getColour());
		System.out.println(honda.getOwnerOfHonda());
	}

}
