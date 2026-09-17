package com.logalakshmi1.springbootapp1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Manganx application is running";
	}
	@PostMapping("/create")
    public String create(@RequestBody String payload) {
		return payload + " successfully created";
    }
	@DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
		return id + " deleted successfully";
    }
}
