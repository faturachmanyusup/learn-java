package com.learn.spring.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "person")
@Entity()
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "person_id")
  private int personId;

  @ManyToMany(mappedBy = "castAndCrew")
  private List<Movie> castAndCrew;

  @Column(name = "person_name")
  private String personName;

  public int getPersonId() {
    return this.personId;
  }

  public void setPersonId(int id) {
    this.personId = id;
  }

  public String getName() {
    return this.personName;
  }

  public void setTitle(String n) {
    this.personName = n;
  }
}
