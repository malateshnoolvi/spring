package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ATMDTO;
import com.xworkz.spring.repository.ATMRepo;

@Component
public class AtmServiceImpl implements AtmService {
	@Autowired
	private ATMRepo repo;

	@Override
	public boolean validateAndSave(ATMDTO dto) {
		System.out.println("running save method of ATM......");
		return this.repo.save(dto);
	}

}
