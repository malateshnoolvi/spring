package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetroDetails {
	@Autowired
	private String metroColor;
	@Autowired
	private int noOfStops;

	public String getMetroColor() {
		return metroColor;
	}

	public int getNoOfStops() {
		return noOfStops;
	}
}
