package com.xworkz.abstraction1.service;

import com.xworkz.abstraction1.dto.BikeDTO;

public interface BikeService {
	boolean validateAndSave(BikeDTO dto);
}
