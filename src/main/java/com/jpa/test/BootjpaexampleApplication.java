package com.jpa.test;

import java.util.List;
import java.util.Optional;

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
	 List<Alien> aliens = repo.getUsersByName("Akarsh Barar");
	 aliens.forEach(t -> {
		 System.out.println(t);
	 });
//	 Create
//	 Alien alien = new Alien();
//	 alien.setName("Akarsh Barar");
//	 alien.setCity("Lucknow");
//	 alien.setStatus("Backend Developer");
//	 Alien a = repo.save(alien);
////	READ ALL
//	 repo.findAll();
//	 
////	 Update
//	 Optional<Alien> optional = repo.findById(2);
//	 Alien aa = optional.get();
//	 aa.setName("Updated Name");
//	 repo.save(aa);
//	 System.out.println(aa);
	}

}
