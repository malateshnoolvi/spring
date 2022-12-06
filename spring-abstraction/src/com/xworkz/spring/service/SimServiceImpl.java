package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.SimDTO;
import com.xworkz.spring.repository.SimRepo;

@Component
public class SimServiceImpl implements SimService {
	@Autowired
	private SimRepo repo;

	@Override
	public boolean validateAndSave(SimDTO dto) {
		System.out.println("running save method of sim......");
		return this.repo.save(dto);
	}

}
