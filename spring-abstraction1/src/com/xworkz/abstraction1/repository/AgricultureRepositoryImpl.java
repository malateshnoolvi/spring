package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.AgricultureDTO;

@Component
public class AgricultureRepositoryImpl implements AgricultureRepository {

	@Override
	public boolean save(AgricultureDTO dto) {
		System.out.println("Running save method of agriculture........");
		return true;
	}

}
