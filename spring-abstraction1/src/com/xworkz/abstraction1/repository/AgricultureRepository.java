package com.xworkz.abstraction1.repository;

import org.springframework.stereotype.Component;
import com.xworkz.abstraction1.dto.AgricultureDTO;

@Component
public interface AgricultureRepository {

	boolean save(AgricultureDTO dto);

}
