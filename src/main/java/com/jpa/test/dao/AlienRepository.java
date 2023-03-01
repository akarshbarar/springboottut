package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer> {

}
