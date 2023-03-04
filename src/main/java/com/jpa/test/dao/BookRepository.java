package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.Books;

public interface BookRepository extends CrudRepository<Books, Integer> {

}
