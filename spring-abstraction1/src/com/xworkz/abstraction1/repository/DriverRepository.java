package com.xworkz.abstraction1.repository;

import com.xworkz.abstraction1.dto.DriverDTO;

public interface DriverRepository {
	boolean save(DriverDTO dto);
}
