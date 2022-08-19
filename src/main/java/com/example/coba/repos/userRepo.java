package com.example.coba.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.coba.models.entities.user;

public interface userRepo extends CrudRepository<user, Long> {
  
}
