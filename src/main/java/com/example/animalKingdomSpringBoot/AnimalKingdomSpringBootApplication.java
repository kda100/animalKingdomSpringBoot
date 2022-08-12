package com.example.animalKingdomSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AnimalKingdomSpringBootApplication {

	final AnimalList animalList = new AnimalList();
	public static void main(String[] args) {
		SpringApplication.run(AnimalKingdomSpringBootApplication.class, args);
	}

	@GetMapping("/customRoute")
	public String myResponse() {
		return animalList.toString();
	}

	@PatchMapping("change/{index}")
	@ResponseBody
	public void change(@PathVariable int index, @RequestParam String name) {
		animalList.change(index, name);
	}

	@PutMapping("/add")
	@ResponseBody
	public void add(@RequestParam String name, @RequestParam String gender) {
		animalList.add(name, Gender.valueOf(gender.toUpperCase()));
	}
}
