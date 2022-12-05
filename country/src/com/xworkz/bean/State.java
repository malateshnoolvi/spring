package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class State {

	private String name;
	private int population;
	private String capitalCity;
	private int noOfDistricts;
	private String area;
	private String cmName;
	private String primaryLang;

	@Autowired
	public State(@Value("Karanataka") String name, @Value("66165886") int population,
			@Value("Bengaluru") String capitalCity, @Value("31") int noOfDistricts, @Value("191791Km^2") String area,
			@Value("BasavarajBommai") String cmName, @Value("Kannada") String primaryLang) {
		super();
		this.name = name;
		this.population = population;
		this.capitalCity = capitalCity;
		this.noOfDistricts = noOfDistricts;
		this.area = area;
		this.cmName = cmName;
		this.primaryLang = primaryLang;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLang="
				+ primaryLang + "]";
	}

}
