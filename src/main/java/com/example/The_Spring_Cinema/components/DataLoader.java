package com.example.The_Spring_Cinema.components;

import com.example.The_Spring_Cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieService movieService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        movieService.addNewMovie();
        movieService.addNewMovie();

    }
}
