package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelOwner {
	@Autowired
	private String ownerName;
	@Autowired
	private int hotelOwnerAge;

	public String getOwnerName() {
		return ownerName;
	}

	public int getHotelOwnerAge() {
		return hotelOwnerAge;
	}

}
