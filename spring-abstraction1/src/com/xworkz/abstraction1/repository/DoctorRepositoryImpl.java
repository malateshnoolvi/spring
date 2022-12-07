package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.DoctorDTO;

@Component
public class DoctorRepositoryImpl implements DoctorRepository {

	@Override
	public boolean save(DoctorDTO dto) {
		System.out.println("Running save method of Doctor.....");
		return true;
	}

}
