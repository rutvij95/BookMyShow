package com.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Show {

    private int showId;
    private Movie movie;
    private Screen screen;
    private String startTime;
    private String duration;
}
