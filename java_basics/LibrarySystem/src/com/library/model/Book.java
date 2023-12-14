package com.library.model;

public class Book{
	private String title;
	private Author author;
	private int pageCount;
	
	// Constructors
	public Book(String title, Author author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
	
	// getters, setters, and other methods
	
	@Override
	public String toString() {
		return "Book{" + 
				"title='" + title + '\'' +
				", author=" + author +
				", pageCount=" + pageCount +
				'}';
	}
}