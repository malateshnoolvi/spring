package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shop {
	@Autowired
	private String shopName;
	@Autowired
	private int shopRent;
	@Autowired
	private ShopDress dress;

	public String getShopName() {
		return shopName;
	}

	public int getShopRent() {
		return shopRent;
	}

	public void display() {
		System.out.println(dress.getBrand());
		System.out.println(dress.getPrice());
	}

}
