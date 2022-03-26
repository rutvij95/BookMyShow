package com.example.bookmyshow.service;

import com.example.bookmyshow.models.City;

public interface CityService {

    City addCity(String cityName);

    City getCityByName(String cityName);

}
