package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.SimDTO;

@Component
public class SimRepoImpl implements SimRepo {

	@Override
	public boolean save(SimDTO dto) {
		System.out.println("Running validateAndSave method .....");
		return true;
	}

}
