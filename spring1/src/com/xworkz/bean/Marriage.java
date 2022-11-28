package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Marriage {
	@Autowired
	private String marriageType;
	@Autowired
	private String marriagePlace;
	@Autowired
	private MarriageGroom groom;

	public String getMarriagePlace() {
		return marriagePlace;
	}

	public String getMarriageType() {
		return marriageType;
	}

	public void display() {
		System.out.println(groom.getGroomName());
		System.out.println(groom.getGroomAge());
	}

}
