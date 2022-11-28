package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pub {
	@Autowired
	private String pubOwnerName;
	@Autowired
	private double pubRent;

	@Autowired
	private PubEntryFee fee;

	public String getPubOwnerName() {
		return pubOwnerName;
	}

	public double getPubRent() {
		return pubRent;
	}

	public void display() {
		System.out.println("PubName:"+" "+fee.getPubName());
		System.out.println("EntryFee:"+" "+fee.getEntryFee());
	}

}
