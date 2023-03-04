package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer> {
//find is introducer and ByName is criteria
	public List<Alien> findByName(String name);
	
	
	@Query("select a from Alien a")
	public List<Alien> getAllAlien();
	
	
	@Query("select a from Alien a where a.name = :n")
	public List<Alien> getUsersByName(@Param("n") String name);
	
	 
}
