package com.example.bookmyshow.serviceImpl;

import com.example.bookmyshow.exception.AlreadyAvailableException;
import com.example.bookmyshow.exception.NotAvailableException;
import com.example.bookmyshow.models.City;
import com.example.bookmyshow.service.CityService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class CityServiceImpl implements CityService {

    Map<String, City> cityMap = new HashMap<>();

    @Override
    public City addCity(String cityName) {
        City city;
        if (cityMap.containsKey(cityName)) {
            city = cityMap.get(cityName);
            throw new AlreadyAvailableException("City is already Registered");
        } else {
            city = new City(UUID.randomUUID().toString(), cityName);
            cityMap.put(cityName, city);
        }
        return city;
    }

    @Override
    public City getCityByName(String cityName) {
        if(cityMap.containsKey(cityName)){

        return cityMap.get(cityName);
        }
        throw new NotAvailableException("City is not added..");
    }


}
