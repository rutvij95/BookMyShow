package com.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Movie {

    private String movieId;
    private String movieName;
}
