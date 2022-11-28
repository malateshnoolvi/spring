package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RailwayStation {
	@Autowired
	private String stationName;
	@Autowired
	private int noOfPlatforms;
	@Autowired
	private RailTrain train;

	public String getStationName() {
		return stationName;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void display() {
		System.out.println(train.getTrainName());
		System.out.println(train.getTrainCapacity());
	}
}
