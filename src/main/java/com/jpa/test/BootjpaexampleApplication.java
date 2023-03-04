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
	}

}
