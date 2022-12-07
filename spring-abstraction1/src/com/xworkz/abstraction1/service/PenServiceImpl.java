package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.PenDTO;
import com.xworkz.abstraction1.repository.PenRepository;

@Component
public class PenServiceImpl implements PenService {

	@Autowired
	private PenRepository repository;

	@Override
	public boolean validateAndSave(PenDTO dto) {
		System.out.println("Running validateAndSave method of Pen.....");
		return this.repository.save(dto);
	}

}
