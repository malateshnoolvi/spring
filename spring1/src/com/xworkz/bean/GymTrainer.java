package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymTrainer {
	@Autowired
	private String trainerName;
	@Autowired
	private double trainerHeight;

	public String getTrainerName() {
		return trainerName;
	}

	public double getTrainerHeight() {
		return trainerHeight;
	}

}
