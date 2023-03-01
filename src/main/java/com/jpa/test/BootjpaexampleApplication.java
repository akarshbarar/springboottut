package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.AlienRepository;
import com.jpa.test.entities.Alien;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	 ApplicationContext context = 	SpringApplication.run(BootjpaexampleApplication.class, args);
	 
	 
	 AlienRepository repo = context.getBean(AlienRepository.class);
	 
	 Alien alien = new Alien();
	 
	 alien.setName("Akarsh Barar");
	 alien.setCity("Lucknow");
	 alien.setStatus("Backend Developer");
	 Alien a = repo.save(alien);
	 System.out.println(a);
	}

}
