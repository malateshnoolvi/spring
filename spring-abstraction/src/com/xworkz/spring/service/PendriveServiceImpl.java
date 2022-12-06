package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.PendriveDTO;
import com.xworkz.spring.repository.PendriveRepo;

@Component
public class PendriveServiceImpl implements PendriveService {
	@Autowired
	private PendriveRepo repo;

	@Override
	public boolean validateAndSave(PendriveDTO dto) {
		System.out.println("running save method of pendrive......");
		return this.repo.save(dto);
	}

}
