package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.DistrictDTO;
import com.xworkz.abstraction1.repository.DistrictRepository;

@Component
public class DistrictServiceImpl implements DistrictService {
	@Autowired
	private DistrictRepository repository;

	@Override
	public boolean validateAndSave(DistrictDTO dto) {
		System.out.println("Running validateAndSave method of District.......");
		return this.repository.save(dto);
	}

}
