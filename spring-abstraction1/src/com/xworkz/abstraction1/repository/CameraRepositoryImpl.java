package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.CameraDTO;

@Component
public class CameraRepositoryImpl implements CameraRepository {

	@Override
	public boolean save(CameraDTO dto) {
		System.out.println("Running save method of Camera........");
		return true;
	}

}
