package com.library;

import com.library.model.Author;
import com.library.model.Book;
import com.library.service.LibraryService;

public class Main{
	public static void main(String[] args) {
		LibraryService libraryService = new LibraryService();
		
		// creating authors
		Author author1 = new Author("John Doe", 35);
		Author author2 = new Author("Jane Smith", 40);
		Author author3 = new Author("Pankaj Ghosh", 30);
		
		// Creating books
		Book book1 = new Book("Introducing to Java", author1, 300);
		Book book2 = new Book("OOP Principles", author2, 250);
		Book book3 = new Book("JavaScript", author3, 50);
		
		// Adding books to the library
		libraryService.addBook(book1);
		libraryService.addBook(book2);
		libraryService.addBook(book3);
		
		// Displaying all books in the library
		System.out.println("All Books in the Library");
		for (Book book : libraryService.getAllBooks()) {
			System.out.println(book);
		}
		
	}
}