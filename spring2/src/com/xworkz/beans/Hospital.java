package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

	private String name;
	@Value("CN Manjunath")
	private String founderName;
	private int since;
	@Autowired
	private Ambulance ambulance;

	@Autowired
	public Hospital(String name) {
		this.name = name;
		System.out.println("created parameter constructor of hospital");
	}

	public void setSince(int since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", founderName=" + founderName + ", since=" + since + ", ambulance="
				+ ambulance + "]";
	}

}
