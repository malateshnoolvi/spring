package com.xworkz.bag.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bag.beans.Bag;

@Configuration
public class BagConfiguration {
	@Bean
	public Bag bag() {
		Bag bag = new Bag();
		return bag;
	}

}
