package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
	@Autowired
	private String adress;
	@Autowired
	private String libraryName;
	@Autowired
	private LibraryBook book;

	public String getAdress() {
		return adress;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void display() {
		System.out.println("BookName " + " " + book.getBookName());
		System.out.println("BookPrice" + " " + book.getBookPrice());
	}

}
