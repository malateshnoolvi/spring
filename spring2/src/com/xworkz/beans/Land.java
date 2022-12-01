package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Land {

	private double sqft;
	@Value("true")
	private boolean borewell;
	
	
	private String soilType;
	@Autowired
	private Farmer farmer;

	public Land(double sqft) {
		System.out.println("created parameter constructor of land");
		this.sqft = sqft;
	}


	public void setSoilType( String soilType) {
		this.soilType = soilType;
	}

	@Override
	public String toString() {
		return "Land [sqft=" + sqft + ", borewell=" + borewell + ", soilType=" + soilType + ", farmer=" + farmer + "]";
	}

}
