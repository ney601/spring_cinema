package com.example.The_Spring_Cinema.services;

import com.example.The_Spring_Cinema.models.Movie;
import com.example.The_Spring_Cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    private Movie movie;

    public MovieService(){
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Movie addMovie() {
        return movieRepository.save();
    }

}

