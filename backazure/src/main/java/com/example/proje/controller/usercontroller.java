package com.example.proje.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proje.model.user;
import com.example.proje.service.userService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class usercontroller {
	
	@Autowired
	userService userserve;
	
	@GetMapping("/name")
	public String name() {
		return "hi sivakajan";
	}

	@PostMapping("/save")
	public String saveit(@RequestBody user user) {
		return userserve.saveall(user);
	}
	
	@GetMapping("/get")
	public List<user> getit(){
		return userserve.get();
	}
	
	@GetMapping("getone/{id}")
	public Optional<user> findsone(@PathVariable("id") Long id) {
		return userserve.findone(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deletedone(@PathVariable("id") Long id) {
		return userserve.deleteone(id);
		
	}
	
}
