package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;

public class Library {
	@Autowired
	private Book book;
	
	public Library() {
		
	}
	
	public Library(Book book) {
		this.book = book;
	}

	public void displayBookDetails() {
		System.out.println(book.toString());
	}

	public Book getbook() {
		return book;
	}

	public void setbook(Book book) {
		this.book = book;
	}
}
