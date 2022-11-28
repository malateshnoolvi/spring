package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Garden {
	@Autowired
	private String gardenName;
	@Autowired
	private Integer noOfChairs;
	@Autowired
	private GardenTree tree;

	public String getGardenName() {
		return gardenName;
	}

	public Integer getNoOfChairs() {
		return noOfChairs;
	}

	public void display() {
		System.out.println(tree.getTreeName());
		System.out.println(tree.getNoOfTrees());
	}
}
