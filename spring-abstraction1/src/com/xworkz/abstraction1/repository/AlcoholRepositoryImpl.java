package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.AlcoholDTO;

@Component
public class AlcoholRepositoryImpl implements AlcoholRepository {

	@Override
	public boolean save(AlcoholDTO dto) {
		System.out.println("Running save method of Alcohol.....");
		return true;
	}

}
