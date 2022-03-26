package com.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
public class Screen {

    private String screenId;
    private String screenName;
    private Theatre theater;
}
