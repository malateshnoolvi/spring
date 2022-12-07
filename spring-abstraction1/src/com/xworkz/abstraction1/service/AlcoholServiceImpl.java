package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.repository.AlcoholRepository;

@Component
public class AlcoholServiceImpl implements AlcoholService {
	@Autowired
	private AlcoholRepository repository;

	@Override
	public boolean validateAndSave() {
		System.out.println("running validateAndSave method of Alcohl.....");
		return this.repository.save(null);
	}

}
