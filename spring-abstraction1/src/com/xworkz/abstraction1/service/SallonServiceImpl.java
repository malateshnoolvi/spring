package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.SallonDTO;
import com.xworkz.abstraction1.repository.SallonRepository;
@Component
public class SallonServiceImpl implements SallonService {
	@Autowired
	private SallonRepository repository;

	@Override
	public boolean validateAndSave(SallonDTO dto) {
		System.out.println("Running validateAndSave method of sallon.....");
		return this.repository.save(dto);
	}

}
