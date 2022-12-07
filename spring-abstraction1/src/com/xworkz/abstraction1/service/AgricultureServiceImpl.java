package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.AgricultureDTO;
import com.xworkz.abstraction1.repository.AgricultureRepository;

@Component
public class AgricultureServiceImpl implements AgricultureService {

	@Autowired
	private AgricultureRepository repository;

	@Override
	public boolean validateAndSave(AgricultureDTO dto) {
		System.out.println("Running validateAndSave method of agriculture.....");
		return this.repository.save(dto);
	}

}
