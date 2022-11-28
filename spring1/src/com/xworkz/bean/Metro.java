package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Metro {
	@Autowired
	private String metroName;
	@Autowired
	private int noOfWorkers;
	@Autowired
	private MetroDetails metro;

	public String getMetroName() {
		return metroName;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void display() {
		System.out.println(metro.getMetroColor());
		System.out.println(metro.getNoOfStops());
	}

}
