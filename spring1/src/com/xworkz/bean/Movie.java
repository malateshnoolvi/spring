package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private String movieName;
	@Autowired
	private double budget;
	@Autowired
	private MovieDirector director;

	public String getMovieName() {
		return movieName;
	}

	public double getBudget() {
		return budget;
	}

	public void display() {
		System.out.println(director.getDirectorName());
		System.out.println(director.getDirectorAge());
	}

}
