package com.xworkz.spring.repository;

import com.xworkz.spring.dto.TheaterDTO;

public class TheaterRepoImpl implements TheaterRepo {

	@Override
	public boolean save(TheaterDTO dto) {
		System.out.println("Running validateAndSave method......");
		return true;
	}

}
