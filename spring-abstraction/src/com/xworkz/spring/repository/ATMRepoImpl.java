package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ATMDTO;

@Component
public class ATMRepoImpl implements ATMRepo {

	@Override
	public boolean save(ATMDTO atmDTO) {
		System.out.println("Running validateAndSave method......");
		return true;
	}

}
