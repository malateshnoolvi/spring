package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PG {
	@Autowired
	private String pgName;
	@Autowired
	private int noOfRooms;
	@Autowired PGOwner owner;

	public String getPgName() {
		return pgName;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void display() {
		System.out.println(owner.getPgOwnerName());
		System.out.println(owner.getPgOwnerAge());
	}
}
