package com.jpa.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jpa.test.entities.Alien;
import com.jpa.test.services.AlienServices;

@RestController
public class RequestConttroller {
	@Autowired
	private AlienServices alienService;
	
	@GetMapping("/aliens")
	public ResponseEntity<Map<String, Object>> addAlien() {
		try {
			List<Alien> aliens =   this.alienService.getAllAlien();
			
			Map<String, Object> response = new HashMap<>();
	        response.put("Status", "Success");
	        response.put("data", aliens);
			return ResponseEntity.status(HttpStatus.OK).body(response);
		} catch (Exception e) {
			// TODO: handle exception
			Map<String, Object> response = new HashMap<>();
	        response.put("Status", "Error");
	        response.put("data", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
			
		}
	}
	
	@GetMapping("/alien/{id}")
	public Optional<Alien> getAlien(@PathVariable("id") int id) {
		return this.alienService.getAlienById(id);
	}

	
	@PostMapping("/aliens")
	public Alien addAlien(@RequestBody Alien alien) {
		this.alienService.addAliens(alien);
		return  alien;
	}
	
	@DeleteMapping("/alien/{id}")
	public void deleteAlien(@PathVariable("id") int id) {
		this.alienService.deleteAlienById(id);
	}
	@PutMapping("/alien/{id}")
	public Optional<Alien> updateAlien(@PathVariable("id") int id, @RequestBody Alien alien) {
		this.alienService.updateAlien(id, alien);
		return this.alienService.getAlienById(id);
	}
}
