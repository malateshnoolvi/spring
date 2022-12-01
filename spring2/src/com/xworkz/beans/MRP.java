package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MRP {
	@Value("15236")
	private int licanceNumber;
	@Qualifier("licanceHolderName")
	private String licanceHolderName;
	private int noOfItems;
	@Autowired
	private Brand brand;

	public MRP(String licanceHolderName) {
		System.out.println("created parameter constructor of mrp");
		this.licanceHolderName = licanceHolderName;

	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	@Override
	public String toString() {
		return "MRP [licanceNumber=" + licanceNumber + ", licanceHolderName=" + licanceHolderName + ", noOfItems="
				+ noOfItems + ", brand=" + brand + "]";
	}

}
