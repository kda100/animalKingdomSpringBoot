package com.example.animalKingdomSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnimalKingdomSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalKingdomSpringBootApplication.class, args);
	}

	@GetMapping("/customRoute")
	public String myResponse() {
		AnimalList animalList = new AnimalList();
		return animalList.toString();
	}

}
