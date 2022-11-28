package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HostelWarden {
	@Autowired
	private String wardenName;
	@Autowired
	private int wardenAge;

	public int getWardenAge() {
		return wardenAge;
	}

	public String getWardenName() {
		return wardenName;
	}
}
