package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.DoctorDTO;
import com.xworkz.abstraction1.repository.DoctorRepository;
@Component
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepository repository;

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("Running validateAndSave method of Doctor......");
		return this.repository.save(dto);
	}

}
