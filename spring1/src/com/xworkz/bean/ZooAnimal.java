package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZooAnimal {
	@Autowired
	private String animalName;
	@Autowired
	private Integer animalAge;

	public Integer getAnimalAge() {
		return animalAge;
	}

	public String getAnimalName() {
		return animalName;
	}
}
