package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class UnionTerritory {

	private String name;
	private String area;
	private String governorName;
	private int population;

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setGovernorName(String governorName) {
		this.governorName = governorName;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "UnionTerritory [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}

}
