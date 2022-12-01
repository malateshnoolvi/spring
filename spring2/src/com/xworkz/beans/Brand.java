package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Brand {

	private String name;
	private String type;
	private double price;
	@Autowired
	@Qualifier("mfgYear")
	private int mfgYear;
	@Autowired
	private boolean quality;


	public Brand(String name, String type) {
		System.out.println("created parameter constructor of brand");
		this.name = name;
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brand [name=" + name + ", type=" + type + ", price=" + price + ", mfgYear=" + mfgYear + ", quality="
				+ quality + "]";
	}

}
