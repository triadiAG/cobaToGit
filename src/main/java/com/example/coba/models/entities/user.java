package com.example.coba.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tblUsers")
public class user implements Serializable {
  
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long UserID;

  private String username;

  @Column(unique = true)
  private String email;
  
  private String password;

  public user(){
    
  }

  public user(long userID,String username,String email,String password) {
    this.UserID = userID;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public long getUserID() {
    return UserID;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  
  

  
}
