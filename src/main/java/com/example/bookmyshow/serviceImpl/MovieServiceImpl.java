package com.example.bookmyshow.serviceImpl;

import com.example.bookmyshow.exception.AlreadyAvailableException;
import com.example.bookmyshow.models.Movie;
import com.example.bookmyshow.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class MovieServiceImpl implements MovieService {

    Map<String, Movie> movieMap = new HashMap<>();

    @Override
    public Movie addMovie(String movieName) {
        Movie movie;
        if (movieMap.containsKey(movieName)) {
            movie = movieMap.get(movieName);
            throw new AlreadyAvailableException("Movie is already Registered");
        } else {
            movie = new Movie(UUID.randomUUID().toString(), movieName);
            movieMap.put(movieName, movie);
        }
        return movie;
    }
}
