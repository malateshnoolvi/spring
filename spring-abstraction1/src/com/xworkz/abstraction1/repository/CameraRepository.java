package com.xworkz.abstraction1.repository;

import com.xworkz.abstraction1.dto.CameraDTO;

public interface CameraRepository {
	boolean save(CameraDTO dto);
}
