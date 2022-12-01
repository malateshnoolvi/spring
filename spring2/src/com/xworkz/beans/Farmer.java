package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Farmer {
	@Qualifier("name1")
	private String name1;
	private int age;
	private String village;
	@Autowired
	private double income;
	@Autowired
	private boolean rich;

	@Autowired
	public Farmer(String name1, int age) {
		System.out.println("created parameter constructor of farmer");
		this.name1 = name1;
		this.age = age;
	}

	
	public void setVillage( String village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Farmer [name1=" + name1 + ", age=" + age + ", village=" + village + ", income=" + income + ", rich="
				+ rich + "]";
	}

}
