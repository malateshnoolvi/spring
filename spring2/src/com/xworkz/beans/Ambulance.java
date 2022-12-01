package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ambulance {
	@Autowired
	@Qualifier("rgNo")
	private String rgNo;
	@Autowired
	@Qualifier("vechileType")
	private String vechileType;
	private boolean siren;
	private boolean ventilation;
	private String fuelType;

	
	
	public Ambulance() {
		super();
		System.out.println("ambu");
		
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Ambulance(boolean siren, boolean ventilation) {
		super();
		System.out.println("created parameter constructor of ambulance");
		this.siren = siren;
		this.ventilation = ventilation;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Ambulance [rgNo=" + rgNo + ", vechileType=" + vechileType + ", siren=" + siren + ", ventilation="
				+ ventilation + ", fuelType=" + fuelType + "]";
	}

}
