package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RailTrain {
	@Autowired
	private String trainName;
	@Autowired
	private int trainCapacity;

	public String getTrainName() {
		return trainName;
	}

	public int getTrainCapacity() {
		return trainCapacity;
	}
}
