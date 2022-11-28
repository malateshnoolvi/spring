package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MarriageGroom {
	@Autowired
	private String groomName;
	@Autowired
	private Integer groomAge;

	public Integer getGroomAge() {
		return groomAge;
	}

	public String getGroomName() {
		return groomName;
	}

}
