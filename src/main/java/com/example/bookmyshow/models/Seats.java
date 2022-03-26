package com.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Seats {

    private String seatId;
    private int seatNo;
    private Screen screen;
}
