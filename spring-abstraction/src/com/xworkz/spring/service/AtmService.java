
package com.xworkz.spring.service;

import com.xworkz.spring.dto.ATMDTO;

public interface AtmService {

	boolean validateAndSave(ATMDTO dto);
	
}
