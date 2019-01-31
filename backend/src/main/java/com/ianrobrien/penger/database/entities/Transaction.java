package com.ianrobrien.penger.database.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String comments;

  protected Transaction() {
  }

  public Transaction(String comments) {
    this.comments = comments;
  }

  public Long getId() {
    return id;
  }

  public String getComments() {
    return comments;
  }

}
