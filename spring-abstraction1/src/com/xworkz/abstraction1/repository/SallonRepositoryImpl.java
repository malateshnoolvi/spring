package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.SallonDTO;
@Component
public class SallonRepositoryImpl implements SallonRepository {

	@Override
	public boolean save(SallonDTO dto) {
		System.out.println("Running save method of Sallon......");
		return true;
	}

}
