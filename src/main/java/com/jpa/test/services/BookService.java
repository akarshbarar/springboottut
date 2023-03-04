package com.jpa.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.test.dao.BookRepository;
import com.jpa.test.entities.Books;

@Component
public class BookService {

	@Autowired
	BookRepository repo;
	
	
	public List<Books> addBooks(Books book) {
		this.repo.save(book);
		return (List<Books>) this.repo.findAll();
	}
	public List<Books> getAllBooks() {
		return (List<Books>) this.repo.findAll();
	}
}
