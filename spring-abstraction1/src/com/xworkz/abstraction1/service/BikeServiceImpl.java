package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.BikeDTO;
import com.xworkz.abstraction1.repository.BikeRepository;

@Component
public class BikeServiceImpl implements BikeService {
	@Autowired
	private BikeRepository repository;

	@Override
	public boolean validateAndSave(BikeDTO dto) {
		System.out.println("Running validateAndSave method of bike.....");
		return this.repository.save(dto);
	}

}
