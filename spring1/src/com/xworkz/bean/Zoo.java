package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
	@Autowired
	private String zooName;
	@Autowired
	private Integer noOfAnimals;
	@Autowired
	private ZooAnimal animal;

	public Integer getNoOfAnimals() {
		return noOfAnimals;
	}

	public String getZooName() {
		return zooName;
	}

	public void display() {
		System.out.println(animal.getAnimalName());
		System.out.println(animal.getAnimalAge());
	}
}
