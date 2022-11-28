package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BarOwner {
	@Autowired
	private String barOwnerName;
	@Autowired
	private int barOwnerAge;

	public String getBarOwnerName() {
		return barOwnerName;
	}

	public int getBarOwnerAge() {
		return barOwnerAge;
	}

}
