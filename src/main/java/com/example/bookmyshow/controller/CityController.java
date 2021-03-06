package com.example.bookmyshow.controller;

import com.example.bookmyshow.models.City;
import com.example.bookmyshow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping("/city/{cityName}")
    public City addCity(@PathVariable("cityName") String cityName) {
        return cityService.addCity(cityName);
    }
}
