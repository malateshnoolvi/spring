package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobileType {
	@Autowired
	private String mobileCompany;
	@Autowired
	private double mobileSize;

	public String getMobileCompany() {
		return mobileCompany;
	}

	public double getMobileSize() {
		return mobileSize;
	}
}
