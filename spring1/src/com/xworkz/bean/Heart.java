package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Heart {
	@Autowired
	private int bloodPump;
	@Autowired
	private String heartColour;

	public int getBloodPump() {
		return bloodPump;
	}

	public String getColour() {
		return heartColour;
	}

}
