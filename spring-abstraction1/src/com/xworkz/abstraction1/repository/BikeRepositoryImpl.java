package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.BikeDTO;
@Component
public class BikeRepositoryImpl implements BikeRepository {

	@Override
	public boolean save(BikeDTO dto) {
		System.out.println("Running save method of Bike......");
		return true;
	}

}
