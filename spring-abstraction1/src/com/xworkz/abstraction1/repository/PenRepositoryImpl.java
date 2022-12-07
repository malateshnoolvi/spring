package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstraction1.dto.PenDTO;

@Component
public class PenRepositoryImpl implements PenRepository {

	@Override
	public boolean save(PenDTO dto) {
		System.out.println("Running save method of Pen......");
		return true;
	}

}
