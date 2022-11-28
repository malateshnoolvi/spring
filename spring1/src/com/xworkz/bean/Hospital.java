package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	@Autowired
	private String name;
	@Autowired
	private int noOfDoctors;
	@Autowired
	private HopitalFounder founder;

	public String getName() {
		return name;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void dispaly() {
		System.out.println(founder.getFounderName());
		System.out.println(founder.getAge());
	}

}
