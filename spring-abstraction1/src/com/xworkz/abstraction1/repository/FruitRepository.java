package com.xworkz.abstraction1.repository;

import com.xworkz.abstraction1.dto.FruitDTO;

public interface FruitRepository {
	boolean save(FruitDTO dto);
}
