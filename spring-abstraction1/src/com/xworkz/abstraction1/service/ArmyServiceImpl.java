package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.ArmyDTO;
import com.xworkz.abstraction1.repository.ArmyRepository;

@Component
public class ArmyServiceImpl implements ArmyService {
	@Autowired
	private ArmyRepository repository;

	@Override
	public boolean validateAndSave(ArmyDTO dto) {
		System.out.println("Running validateAndSave method of Army.......");
		return this.repository.save(dto);
	}

}
