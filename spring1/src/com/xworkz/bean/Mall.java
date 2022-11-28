package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Mall {
	@Autowired
	private String mallName;
	@Autowired
	private int noOfShops;
	@Autowired
	private MallOwner owner;

	public String getMallName() {
		return mallName;
	}

	public int getNoOfShops() {
		return noOfShops;
	}
	public void dispaly() {
		System.out.println(owner.getMallOwnerName());
		System.out.println(owner.getOwnerAge());
	}

}
