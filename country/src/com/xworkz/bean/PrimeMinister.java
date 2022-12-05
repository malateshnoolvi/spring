package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {

	@Value("NarendraModi")
	private String name;
	@Value("72")
	@Qualifier("age")
	private int age;
	@Value("gujarat")
	private String State;
	@Value("5years")
	private String terms;
	@Autowired
	@Qualifier("primeMinisterEducation")
	private Education education;
	@Autowired
	@Qualifier("primeMinisterSalary")
	private Salary salary;
	@Value("BJP")
	private String party;

	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", State=" + State + ", terms=" + terms + ", education="
				+ education + ", salary=" + salary + ", party=" + party + "]";
	}

}
