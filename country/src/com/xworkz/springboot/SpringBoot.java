package com.xworkz.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.Country;
import com.xworkz.configuration.SpringConfig;

public class SpringBoot {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Country bean = context.getBean(Country.class);
		System.out.println(bean);
	}

}
