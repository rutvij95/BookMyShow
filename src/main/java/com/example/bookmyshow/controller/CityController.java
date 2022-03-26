package com.example.bookmyshow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {

    @GetMapping("/code")
    public List<String> runCode() {
        return new ArrayList<>() {
            {
                add("Running");
                add("Calling");
            }
        };
    }
}
