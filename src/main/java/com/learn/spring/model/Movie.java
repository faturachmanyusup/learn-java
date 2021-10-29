package com.learn.spring.model;

import java.util.List;

// import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;

@Entity
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int movie_id;

  @ManyToMany
  @JoinTable(
    name = "movie_cast",
    joinColumns = @JoinColumn(name = "movie_id"),
    inverseJoinColumns = @JoinColumn(name = "person_id")
  )
  @OrderColumn(name = "cast_order")
  private List<Person> castAndCrew;

  private int budget;
  private String title;
  private String overview;
  private String movie_status;
  // private int revenue;
  // private int runtime;
  // private String homepage;
  // private String tagline;
  // private Float popularity;
  // private LocalDate release_date;

  public int getMovieId() {
    return this.movie_id;
  }

  public void setMovieId(int movie_id) {
    this.movie_id = movie_id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getOverview() {
    return this.overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public String getMovieStatus() {
    return this.movie_status;
  }

  public void setMovieStatus(String movie_status) {
    this.movie_status = movie_status;
  }

  public int getBudget() {
    return this.budget;
  }

  public void setBudget(int budget) {
    this.budget = budget;
  }

  public List<Person> getMovieCast() {
    return this.castAndCrew;
  }

  public void setMovieCast(List<Person> cast) {
    this.castAndCrew = cast;
  }
}
