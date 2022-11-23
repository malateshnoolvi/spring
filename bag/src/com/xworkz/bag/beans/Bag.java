package com.xworkz.bag.beans;

import org.springframework.stereotype.Component;

@Component
public class Bag {
	
	public Bag() {
		System.out.println("bag constructor");
	}
	public void carrying() {
		System.out.println("carring items");
	}

}
