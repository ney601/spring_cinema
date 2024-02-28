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

    public Movie getMovieById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if(movie.isPresent()){
            return movie.get();
        }
//        DO ERROR HANDLING
//        optional is like buffer to check if the movie exists
        return null;
    }

//    public Movie addMovie(Movie movie) {
//        movieRepository.save(movie);
//        return movie;
//    }

    public Movie addNewMovie(Movie movie){
        movieRepository.save(movie);   // saving movie in database
        return movie;
    }

}

