package com.xworkz.spring.service;

import com.xworkz.spring.dto.TheaterDTO;
import com.xworkz.spring.repository.TheaterRepo;

public class TheaterServiceImpl implements TheaterService {

	private TheaterRepo repo;
	
	@Override
	public boolean validateAndSave(TheaterDTO dto) {
		System.out.println("running save method of Theater......");
		return this.repo.save(dto);
	}


}
