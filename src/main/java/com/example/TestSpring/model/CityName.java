package com.example.TestSpring.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CityName {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    @Column
    String city;
    @Column
    String state;
    @Column
    String population;
    @Column
    String airport;
    @Column
    String busstand;
    @Column
    String railwaystation;
}
