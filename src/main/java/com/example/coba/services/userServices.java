package com.example.coba.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coba.models.entities.user;
import com.example.coba.repos.userRepo;

@Service
@Transactional
public class userServices {
  
  @Autowired
  private userRepo userRepo;

  public user save(user user){
    return userRepo.save(user);
  }

  public user findOne(long id){
    return userRepo.findById(id).get();
  }

  public Iterable<user> findAll(){
    return userRepo.findAll();
  }

  public void removeOne(long id){
    userRepo.deleteById(id);
  }

}
