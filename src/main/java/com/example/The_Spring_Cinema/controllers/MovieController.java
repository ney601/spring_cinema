package com.example.The_Spring_Cinema.controllers;

import com.example.The_Spring_Cinema.models.Movie;
import com.example.The_Spring_Cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {  //SINGLE MOVIE, SHOWS THE PATH
//        Optional<Movie> movie = movieService.getMovieById(id);
//        if (movie.isPresent()){
//            Movie movie1 = new Movie(
//            );
//            return new ResponseEntity<>(movie1, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
//        Movie newMovie = movieService.addMovie(movie);
//        return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
//    }

    @PostMapping
    public ResponseEntity<Movie> addNewMovie(@RequestBody Movie movie) {   // passing
        movieService.addNewMovie(movie);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);

    }

}
