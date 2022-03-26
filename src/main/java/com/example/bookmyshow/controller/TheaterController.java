package com.example.bookmyshow.controller;

import com.example.bookmyshow.dto.ScreenDto;
import com.example.bookmyshow.models.Screen;
import com.example.bookmyshow.models.Theatre;
import com.example.bookmyshow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class TheaterController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/theatre/city/{cityName}")
    public Theatre addTheater(Theatre theater, @PathVariable("cityName") String cityName) {
        return theatreService.addTheatre(theater, cityName);
    }


    @PostMapping("/theatre/{theatreId}")
    public Screen addScreen(ScreenDto screenDto, @PathVariable("theatreId") String theatreId) {
        Theatre theatre = theatreService.getTheatreById(theatreId);
        return theatreService.addScreen(screenDto, theatre);
    }
}
