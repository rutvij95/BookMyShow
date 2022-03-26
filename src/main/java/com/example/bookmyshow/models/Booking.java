package com.example.bookmyshow.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@EqualsAndHashCode
@Getter
public class Booking {

    private int bookingId;
    private Show show;
    private List<Seats> seatsList;
    private String userName;
    private BookingStatus bookingStatus;

}
