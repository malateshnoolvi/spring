package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.DistrictDTO;
@Component
public class DistrictRepositoryImpl implements DistrictRepository {

	@Override
	public boolean save(DistrictDTO dto) {
		System.out.println("Running save method of District.......");
		return true;
	}

}
