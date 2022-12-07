package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.FruitDTO;

@Component
public class FruitRepositoryImpl implements FruitRepository {

	@Override
	public boolean save(FruitDTO dto) {
		System.out.println("Running save method of Fruit........");
		return true;
	}

}
