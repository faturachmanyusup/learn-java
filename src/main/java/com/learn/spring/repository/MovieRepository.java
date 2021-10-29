package com.learn.spring.repository;

import java.util.List;

import com.learn.spring.model.Movie;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
  List<Movie> findTop10ByTitle(String t);
  List<Movie> findTop10ByTitleContaining(String s);
}