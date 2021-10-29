package com.learn.spring.repository;

import java.util.List;

import com.learn.spring.model.Person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Person findByPersonId(int id);
  List<Person> findTop10ByPersonName(String t);
  List<Person> findTop10ByPersonNameContaining(String s);
}