package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
	@Autowired
	private String hotelName;
	@Autowired
	private String type;
	@Autowired
	private HotelOwner owner;

	public String getHotelName() {
		return hotelName;
	}

	public String getType() {
		return type;
	}

	public void display() {
		System.out.println(owner.getOwnerName());
		System.out.println(owner.getHotelOwnerAge());

	}

}
