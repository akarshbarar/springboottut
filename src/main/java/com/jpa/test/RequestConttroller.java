package com.jpa.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.Alien;
import com.jpa.test.services.AlienServices;

@RestController
public class RequestConttroller {
	@Autowired
	private AlienServices alienService;
	
	@GetMapping("/aliens")
	public List<Alien> addAlien() {
		
		return  this.alienService.getAllAlien();
	}
	
	@GetMapping("/alien/{id}")
	public Alien getAlien(@PathVariable("id") int id) {
		return this.alienService.getAlienById(id);
	}

}
