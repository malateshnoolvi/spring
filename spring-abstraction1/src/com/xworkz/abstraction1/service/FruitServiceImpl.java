package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.FruitDTO;
import com.xworkz.abstraction1.repository.FruitRepository;

@Component
public class FruitServiceImpl implements FruitService {

	@Autowired
	private FruitRepository repository;

	@Override
	public boolean validateAndSave(FruitDTO dto) {
		System.out.println("Running validateAndSave method of Fruit........");
		return this.repository.save(dto);
	}

}
