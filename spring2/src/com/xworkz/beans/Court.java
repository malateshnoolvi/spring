package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {

	private String type;
	@Value("100")
	private int noOfLawyers;
	private String place;
	@Autowired
	private Judge judge;


	public Court(String type) {
		System.out.println("created parameter constructor of court");
		this.type = type;
	}

	public void setAdress(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Court [type=" + type + ", noOfLawyers=" + noOfLawyers + ", place=" + place + ", judge=" + judge + "]";
	}

}
