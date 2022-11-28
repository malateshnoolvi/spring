package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryBook {
	
	@Autowired
	private String bookName;
	@Autowired
	private int bookPrice;
	
	public String getBookName() {
		return bookName;
	}
	
	public int getBookPrice() {
		return bookPrice;
	} 

}
