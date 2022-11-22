package com.xworkz.bag.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bag.beans.Bag;
import com.xworkz.bag.configuration.BagConfiguration;

public class BagBoot {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BagConfiguration.class);
		Bag bean = context.getBean(Bag.class);
		bean.carrying();
	}

}
