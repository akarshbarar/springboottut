package com.jpa.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.Books;
import com.jpa.test.services.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
//	Add Books
	@PostMapping("/books")
	public 	ResponseEntity<Map<String, Object>> addBooks(@RequestBody Books book) {
		try {
			
			List<Books> books = this.service.addBooks(book);
			Map<String, Object> response = new HashMap<>();
	        response.put("Status", "Success");
	        response.put("data", books);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} catch (Exception e) {
			// TODO: handle exception
			Map<String, Object> response = new HashMap<>();
	        response.put("Status", "Error");
	        response.put("data", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
//  Get All Books
	@GetMapping("/books")
	public ResponseEntity<Map<String, Object>> getAllBooks() {
	try {
			
			List<Books> books = this.service.getAllBooks();
			Map<String, Object> response = new HashMap<>();
	        response.put("Status", "Success");
	        response.put("data", books);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (Exception e) {
			// TODO: handle exception
			Map<String, Object> response = new HashMap<>();
	        response.put("Status", "Error");
	        response.put("data", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
	
//	get one book by id
	
//	get all books by author name
	
//	Delete a book by id
		
//	Update a book by id
}
