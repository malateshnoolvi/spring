package com.xworkz.abstraction1.service;

import com.xworkz.abstraction1.dto.DoctorDTO;

public interface DoctorService {
	boolean validateAndSave(DoctorDTO dto);
}
