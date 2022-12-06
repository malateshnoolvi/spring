package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.RoboDTO;
import com.xworkz.spring.repository.RoboRepo;

@Component
public class RoboServiceImpl implements RoboService {
	@Autowired
	private RoboRepo repo;

	@Override
	public boolean validateAndSave(RoboDTO dto) {
		System.out.println("running save method of robo......");
		return this.repo.save(dto);
	}

}
