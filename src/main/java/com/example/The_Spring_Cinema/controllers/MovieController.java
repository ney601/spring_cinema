package com.example.The_Spring_Cinema.controllers;

import com.example.The_Spring_Cinema.models.Movie;
import com.example.The_Spring_Cinema.models.Reply;
import com.example.The_Spring_Cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<Reply> newMovie(@RequestBody ArrayList<Movie> movies) {
        Reply reply = movieService.addNewMovie();
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }
}
