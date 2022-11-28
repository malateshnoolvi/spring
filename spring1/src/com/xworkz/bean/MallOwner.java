package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MallOwner {
	@Autowired
	private String mallOwnerName;
	@Autowired
	private int ownerAge;

	public String getMallOwnerName() {
		return mallOwnerName;
	}

	public int getOwnerAge() {
		return ownerAge;
	}

}
