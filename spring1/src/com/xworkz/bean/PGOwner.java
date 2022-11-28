package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PGOwner {
	@Autowired
	private String pgOwnerName;
	@Autowired
	private int pgOwnerAge;

	public String getPgOwnerName() {
		return pgOwnerName;
	}

	public int getPgOwnerAge() {
		return pgOwnerAge;
	}
}
