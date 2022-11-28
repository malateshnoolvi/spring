package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MovieDirector {
	@Autowired
	private String directorName;
	@Autowired
	private int directorAge;

	public String getDirectorName() {
		return directorName;
	}

	public int getDirectorAge() {
		return directorAge;
	}
}
