package com.jpa.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jpa.test.entities.Alien;

@Component
public class AlienServices {

	private static List<Alien> list = new ArrayList<>();
	
	static {
		list.add(new Alien(1,"One", "city one", "status one"));
		list.add(new Alien(2,"Two", "city 2", "status 2"));
		list.add(new Alien(3,"three", "city 3", "status 3"));
		list.add(new Alien(4,"four", "city 4", "status 4"));
	}
	
//	Get All Alien
	public List<Alien> getAllAlien() {
		return list;
	}
	
//	 get single alien by id
	public Alien getAlienById(int id) {
		Alien alien = new Alien();
		alien = list.stream().filter(e->e.getId() == id).findFirst().get();
		return alien;
	}
}

