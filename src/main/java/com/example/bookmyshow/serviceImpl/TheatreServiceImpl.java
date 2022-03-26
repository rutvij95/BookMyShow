package com.example.bookmyshow.serviceImpl;

import com.example.bookmyshow.dto.ScreenDto;
import com.example.bookmyshow.exception.NotAvailableException;
import com.example.bookmyshow.models.Screen;
import com.example.bookmyshow.models.Seats;
import com.example.bookmyshow.models.Theatre;
import com.example.bookmyshow.service.CityService;
import com.example.bookmyshow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    CityService cityService;

    Map<String, Theatre> theatreMap = new HashMap<>();
    Map<String, Screen> screenMap = new HashMap<>();
    Map<String, Seats> seatsMap = new HashMap<>();

    @Override
    public Theatre addTheatre(Theatre theatre, String cityName) {
        theatre.setTheatreId(UUID.randomUUID().toString());
        theatre.setCity(cityService.getCityByName(cityName));
        theatreMap.put(theatre.getTheatreId(), theatre);
        return theatre;
    }

    @Override
    public Theatre getTheatreById(String theatreId) {
        if (theatreMap.containsKey(theatreId)) {
            return theatreMap.get(theatreId);
        }
        throw new NotAvailableException("Theater is not added...");
    }

    @Override
    public Screen addScreen(ScreenDto screenDto, Theatre theatre) {
        Screen screen = new Screen(UUID.randomUUID().toString(), screenDto.getScreenName(), theatre);

        addSeats(screen.getScreenId(), screenDto.getTotalSeats());

        return screen;
    }

    @Override
    public Screen getScreenById(String screenId) {
        if (screenMap.containsKey(screenId)) {
            return screenMap.get(screenId);
        }
        throw new NotAvailableException("Screen is not added...");
    }

    private void addSeats(String screenId, Integer totalSeats) {
        for (int i = 0; i < totalSeats; i++) {
            Seats seats = new Seats(UUID.randomUUID().toString(), i + 1, getScreenById(screenId));
            seatsMap.put(seats.getSeatId(), seats);
        }
    }
}
