package com.xworkz.abstraction1.repository;

import com.xworkz.abstraction1.dto.DoctorDTO;

public interface DoctorRepository {
	
	boolean save(DoctorDTO dto);

}
