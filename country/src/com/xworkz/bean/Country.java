package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("India")
	private String name;
	@Autowired
	private President president;
	@Autowired
	private VicePresident vicePresident;
	@Autowired
	private PrimeMinister primeMinister;
	@Value("1155000")
	private int armySize;
	@Value("Republic")
	private String type;
	@Autowired
	private State state;
	@Autowired
	private UnionTerritory unionTerritory;
	@Autowired
	private City capitalCity;

	@Override
	public String toString() {
		return "Country [name=" + name + ", president=" + president + ", vicePresident=" + vicePresident
				+ ", primeMinister=" + primeMinister + ", armySize=" + armySize + ", type=" + type + ", state=" + state
				+ ", unionTerritory=" + unionTerritory + ", capitalCity=" + capitalCity + "]";
	}

}
