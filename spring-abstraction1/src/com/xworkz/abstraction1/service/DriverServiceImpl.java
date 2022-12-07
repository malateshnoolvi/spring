package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.DriverDTO;
import com.xworkz.abstraction1.repository.DriverRepository;

@Component
public class DriverServiceImpl implements DriverService {
	@Autowired
	private DriverRepository repository;

	@Override
	public boolean validateAndSave(DriverDTO dto) {
		System.out.println("Running validateAndSave method of Driver........");
		return this.repository.save(dto);
	}

}
