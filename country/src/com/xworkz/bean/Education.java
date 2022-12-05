package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Education {
	private int id;
	private String university;
	private String branch;
	private int year;
	private String place;
	private boolean backlogs;
	private double percentage;
	private boolean passed;

	// @Autowired
	public Education(int id, String university, String branch, int year, String place, boolean backlogs,
			double percentage, boolean passed) {
		super();
		this.id = id;
		this.university = university;
		this.branch = branch;
		this.year = year;
		this.place = place;
		this.backlogs = backlogs;
		this.percentage = percentage;
		this.passed = passed;
	}

	@Override
	public String toString() {
		return "Education [id=" + id + ", university=" + university + ", branch=" + branch + ", year=" + year
				+ ", place=" + place + ", backlogs=" + backlogs + ", percentage=" + percentage + ", passed=" + passed
				+ "]";
	}

}
