package com.library.model;

public class Ebook extends Book{
	private String format;
	
	public Ebook(String title, Author author, int pageCount, String format) {
		super(title, author, pageCount);
		this.format = format;
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Ebook Details:");
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Page Count: " + getPageCount());
		System.out.println("Format: " + format);
	}

	
	public String toString() {
		return "Book{" + 
				"title = '" + getTitle() + '\'' +
				", author = " + getAuthor() +
				", pageCount = " + getPageCount() +
				", format = " + format +
				'}';
	}
}