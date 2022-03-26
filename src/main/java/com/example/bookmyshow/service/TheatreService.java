package com.example.bookmyshow.service;

import com.example.bookmyshow.dto.ScreenDto;
import com.example.bookmyshow.models.Screen;
import com.example.bookmyshow.models.Theatre;

public interface TheatreService {

    Theatre addTheatre(Theatre theater, String cityName);

    Theatre getTheatreById(String theatreId);

    Screen addScreen(ScreenDto screenDto, Theatre theatre);

    Screen getScreenById(String screenId);
}
