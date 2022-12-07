package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.ArmyDTO;

@Component
public class ArmyRepositoryImpl implements ArmyRepository {

	@Override
	public boolean save(ArmyDTO dto) {
		System.out.println("Running save method of Army......");
		return true;
	}

}
