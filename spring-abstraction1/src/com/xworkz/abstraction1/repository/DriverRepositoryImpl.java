package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.DriverDTO;

@Component
public class DriverRepositoryImpl implements DriverRepository {

	@Override
	public boolean save(DriverDTO dto) {
		System.out.println("Running save method of Driver........");
		return true;
	}

}
