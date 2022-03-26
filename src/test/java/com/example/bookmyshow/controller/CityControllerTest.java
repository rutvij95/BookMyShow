package com.example.bookmyshow.controller;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import com.example.bookmyshow.models.City;
import com.example.bookmyshow.service.CityService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.util.UUID;

class CityControllerTest {

    CityService cityService = Mockito.mock(CityService.class);

    @Test
    void addCityBangalore() {
//        City city = new City(UUID.randomUUID().toString(), "Bangalore");
//        when(cityService.addCity("Bangalore")).then((Answer<?>) city);
//        assertEquals(city, cityService.addCity("Bangalore"));
    }

}