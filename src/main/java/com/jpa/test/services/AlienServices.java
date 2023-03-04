package com.jpa.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.test.dao.AlienRepository;
import com.jpa.test.entities.Alien;

@Component
public class AlienServices {

	@Autowired
	private AlienRepository repo;
//	private static List<Alien> list = new ArrayList<>();
//	
//	static {
//		list.add(new Alien(1,"One", "city one", "status one"));
//		list.add(new Alien(2,"Two", "city 2", "status 2"));
//		list.add(new Alien(3,"three", "city 3", "status 3"));
//		list.add(new Alien(4,"four", "city 4", "status 4"));
//	}
	
//	Get All Alien
	public List<Alien> getAllAlien() {
		return this.repo.getAllAlien();
	}
	
//	 get single alien by id
	public Optional<Alien> getAlienById(int id) {
		return this.repo.findById(id);
	}
	
//	add alien
	public void addAliens(Alien alien) {
		this.repo.save(alien);
	}
	
//	Delete alien
	public void deleteAlienById(int id) {
		this.repo.deleteById(id);
//		list = list.stream().filter(alien -> {
//			if(alien.getId() != id) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}).collect(Collectors.toList());
	}
//	update
	public void updateAlien(int id, Alien alien) {
		alien.setId(id);
		this.repo.save(alien);
//		list.stream().map(a -> {
//			if (a.getId() == id) {
//				a.setName(alien.getName());
//				a.setCity(alien.getCity());
//				a.setStatus(alien.getStatus());
//			}
//			return a;
//		}).collect(Collectors.toList());
	}
}

