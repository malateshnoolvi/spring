package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeHonda {
	@Autowired
	private String colour;

	@Autowired
	private String ownerOfHonda;

	public String getColour() {
		return colour;
	}

	public String getOwnerOfHonda() {
		return ownerOfHonda;
	}
}
