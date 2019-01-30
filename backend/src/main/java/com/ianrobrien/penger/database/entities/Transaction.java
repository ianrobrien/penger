package com.ianrobrien.penger.database.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String comments;

  public Long getId() {
    return id;
  }

  public String getComments() {
    return comments;
  }

}
