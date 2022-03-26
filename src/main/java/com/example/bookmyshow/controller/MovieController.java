package com.example.bookmyshow.controller;

import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/movie/{movieName}")
    public Movie addMovie(@PathVariable String movieName) {
        return movieService.addMovie(movieName);
    }
}
