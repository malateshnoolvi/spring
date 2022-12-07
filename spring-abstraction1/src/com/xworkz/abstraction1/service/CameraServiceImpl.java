package com.xworkz.abstraction1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.CameraDTO;
import com.xworkz.abstraction1.repository.CameraRepository;

@Component
public class CameraServiceImpl implements CameraService {
	@Autowired
	private CameraRepository repository;

	@Override
	public boolean validateAndSave(CameraDTO dto) {
		System.out.println("Running validateAndSave method of camera........");
		return this.repository.save(dto);
	}

}
