package com.example.proje.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proje.model.user;

public interface userRepo extends JpaRepository<user, Long> {

}
