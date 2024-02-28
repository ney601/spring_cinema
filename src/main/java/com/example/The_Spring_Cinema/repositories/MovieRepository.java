package com.example.The_Spring_Cinema.repositories;

import com.example.The_Spring_Cinema.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {


}

// REPOSITORY CREATES AN OBJECT THAT...
// A LAYER BETWEEN JAVA CLASS AND POSTGRES
// JUST ESTABLISH THE CONNECTION AND SEVER IT
// STORE ITEMS AND RETRIEVE IT