package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Institute {

	private String name;
	@Value("false")
	private boolean isAcAvailable;
	private boolean projecter;
	@Autowired
	private Founder founder;


	public Institute(String name) {
		System.out.println("created parameter constructor of institute");
		this.name = name;

	}

	public void setProjecter(boolean projecter) {
		this.projecter = projecter;
	}

	@Override
	public String toString() {
		return "Institute [name=" + name + ", isAcAvailable=" + isAcAvailable + ", projecter=" + projecter
				+ ", founder=" + founder + "]";
	}

}
