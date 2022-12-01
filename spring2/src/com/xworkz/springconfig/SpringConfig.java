package com.xworkz.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Ambulance;
import com.xworkz.beans.Brand;
import com.xworkz.beans.Court;
import com.xworkz.beans.Farmer;
import com.xworkz.beans.Founder;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Institute;
import com.xworkz.beans.Judge;
import com.xworkz.beans.Land;
import com.xworkz.beans.MRP;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("default constructor of springconfig......");
	}

	@Bean
	public String rgNo() {
		return "KA01RT9845";
	}

	@Bean
	public String vechileType() {
		return "omni";
	}

	@Bean
	public Hospital hospital() {
		Hospital hos = new Hospital("jaydev");
		return hos;
	}

	@Bean
	public Ambulance ambulance() {
		Ambulance amb = new Ambulance(true, false);
		amb.setFuelType("deisel");
		return amb;
	}

	@Bean
	public Land land() {
		Land land = new Land(54000.00);
		return land;
	}

	@Bean
	public Farmer farmer() {
		Farmer farmer = new Farmer("Devegouda", 50);
		farmer.setVillage("devipura");
		return farmer;
	}

	@Bean
	public double income() {
		return 50000;
	}

	@Bean
	public boolean rich() {
		return true;
	}

	@Bean
	public Institute institute() {
		Institute institute = new Institute("Xworkz");
		institute.setProjecter(false);
		return institute;
	}

	@Bean
	public Founder founder() {
		Founder founder = new Founder("Omkar", 36);
		founder.setGender("male");
		return founder;
	}

	@Bean
	public boolean isMarried() {
		return true;
	}

	@Bean
	public boolean isBusinessMan() {
		return false;
	}

	@Bean
	public Court court() {
		Court court = new Court("FamilyCourt");
		court.setAdress("ShantiNagar");
		return court;
	}

	@Bean
	public Judge judge() {
		Judge judge = new Judge("Santosh", 63);
		judge.setExperince(true);
		return judge;
	}

	@Bean
	public String education() {
		return "law";
	}

	@Bean
	public double salary() {
		return 50000.00;
	}

	@Bean
	public MRP mrp() {
		MRP mrp = new MRP("dev");
		return mrp;
	}

	@Bean
	public Brand brand() {
		Brand brand = new Brand("Tommy", "Boy");
		brand.setPrice(600.00);
		return brand;
	}

	@Bean
	public int mfgYear() {
		return 1990;
	}

	@Bean
	public boolean quality() {
		return true;
	}
}
