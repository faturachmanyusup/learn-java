package com.learn.spring.controller;

import java.util.Optional;

import com.learn.spring.model.Movie;
import com.learn.spring.model.Person;
import com.learn.spring.repository.MovieRepository;
import com.learn.spring.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RestController()
@RequestMapping("/movie")
public class MovieController extends Movie {
  @Autowired
  private MovieRepository movieRepository;

  @Autowired
  private PersonRepository personRepository;

  @GetMapping()
  public @ResponseBody Optional<Movie> getMovie(@RequestParam("id") int id) {
    return movieRepository.findById(id);
  }

  @GetMapping("/search")
  public @ResponseBody Iterable<Movie> search(@RequestParam("t") String t) {
    return movieRepository.findTop10ByTitleContaining(t);
  }

  @GetMapping("/all")
  public @ResponseBody Iterable<Movie> getAllUsers() {
    // This returns a JSON or XML with the users
    return movieRepository.findAll();
  }

  @GetMapping("/cast")
  public @ResponseBody Person getCastById(@RequestParam("id") int id) {
    return personRepository.findByPersonId(id);
  }
}
