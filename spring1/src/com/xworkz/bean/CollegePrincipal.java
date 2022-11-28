package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CollegePrincipal {
	@Autowired
	private String principalName;
	@Autowired
	private String principalEducation;

	public String getPrincipalName() {
		return principalName;
	}

	public String getPrincipalEducation() {
		return principalEducation;
	}

}
