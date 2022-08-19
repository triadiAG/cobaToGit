package com.example.coba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coba.models.entities.user;
import com.example.coba.services.userServices;

@RestController
@RequestMapping("/api/user")
public class userController {

  @Autowired
  private userServices userServices;

  @PostMapping
  public user create(@RequestBody user user){
    return userServices.save(user);
  }
  
  @GetMapping
  public Iterable<user> findAll(){
    return userServices.findAll();
  }

  @GetMapping("/{id}")
  public user findOne(@PathVariable("id")long id){
    return userServices.findOne( id);
  }

  @PutMapping
  public user update(@RequestBody user user){
    return userServices.save(user);
  }

  @DeleteMapping("/{id}")
  public void removeOne(@PathVariable("id")long id){
    userServices.removeOne( id);
  }
}
