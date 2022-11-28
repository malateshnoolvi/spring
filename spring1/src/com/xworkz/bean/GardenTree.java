package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GardenTree {
	@Autowired
	private Integer noOfTrees;
	@Autowired
	private String treeName;

	public Integer getNoOfTrees() {
		return noOfTrees;
	}

	public String getTreeName() {
		return treeName;
	}

}
