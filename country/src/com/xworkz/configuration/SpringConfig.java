package com.xworkz.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bean.City;
import com.xworkz.bean.Education;
import com.xworkz.bean.Salary;
import com.xworkz.bean.UnionTerritory;
import com.xworkz.bean.VicePresident;
import com.xworkz.constants.Type;

@Configuration
@ComponentScan("com.xworkz.bean")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("default constructor of springconfig......");
	}

	@Bean
	public Education presidentEducation() {
		Education ed = new Education(1, "Ramadevi womens university", "LLB", 1980, "odisa", false, 75, true);
		return ed;
	}

	@Bean

	Education vicePresidentEducation() {
		Education edu = new Education(2, "uniersity of rajastan", "LLB", 1979, "rajastan", false, 78, true);
		return edu;
	}

	@Bean
	public Education primeMinisterEducation() {
		Education edc = new Education(3, "gujarat university", "BA", 1983, "gujarat", false, 65, true);
		return edc;
	}

	@Bean
	public Salary presidentSalary() {
		Salary sl = new Salary(250000, 120000, 136000, 120000, 125000, 50000, 800000, 800000);
		return sl;
	}

	@Bean
	public Salary vicePresidentSalary() {
		Salary slr = new Salary(230000, 110000, 145000, 144000, 125000, 40000, 600000, 700000);
		return slr;
	}

	@Bean
	public Salary primeMinisterSalary() {
		Salary sly = new Salary(280000, 150000, 139000, 127000, 125000, 60000, 600000, 800000);
		return sly;
	}

	@Bean
	public Type type() {
		return Type.PERSON;
	}

	@Bean
	public UnionTerritory unionTerritory() {

		UnionTerritory territory = new UnionTerritory();
		territory.setGovernorName("Admiral D K Joshi");
		territory.setArea("1841Km^2");
		territory.setName(null);
		return territory;
	}
}
