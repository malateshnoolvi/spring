package com.xworkz.spring.repository;

import com.xworkz.spring.dto.RoboDTO;

public class RoboRepoImpl implements RoboRepo {

	@Override
	public boolean save(RoboDTO dto) {
		System.out.println("Running validateAndSave method......");

		return true;
	}

}
