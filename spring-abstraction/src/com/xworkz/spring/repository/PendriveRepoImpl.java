package com.xworkz.spring.repository;

import com.xworkz.spring.dto.PendriveDTO;

public class PendriveRepoImpl implements PendriveRepo {

	@Override
	public boolean save(PendriveDTO dto) {
		System.out.println("Running validateAndSave method......");
		return true;
	}

}
