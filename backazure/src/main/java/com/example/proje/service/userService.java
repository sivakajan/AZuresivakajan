package com.example.proje.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proje.model.user;
import com.example.proje.repository.userRepo;

@Service
public class userService {

	@Autowired
	userRepo userrepo;
	
	public String saveall(user user) {
		userrepo.save(user);
		return "save success";
	}
	
	public List<user> get(){
		return userrepo.findAll();
	}
	
	public Optional<user> findone(Long id) {
		return userrepo.findById(id);
	}
	
	public String deleteone(Long id) {
		userrepo.deleteById(id);
		return "deleted";
	}
}
