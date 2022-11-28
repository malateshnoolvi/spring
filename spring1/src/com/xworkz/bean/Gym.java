package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gym {
	@Autowired
	private String gymName;
	@Autowired
	private int noOfGymItems;
	@Autowired
	private GymTrainer trainer;

	public String getGymName() {
		return gymName;
	}

	public int getNoOfGymItems() {
		return noOfGymItems;
	}

	public void display() {
		System.out.println(trainer.getTrainerName());
		System.out.println(trainer.getTrainerHeight());
	}

}
