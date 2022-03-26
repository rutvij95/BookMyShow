package com.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
public class Theatre {

    private String theatreId;
    private String theatreName;
    private City city;



}
