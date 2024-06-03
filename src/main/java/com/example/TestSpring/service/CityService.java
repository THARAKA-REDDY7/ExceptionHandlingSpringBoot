package com.example.TestSpring.service;

import com.example.TestSpring.model.City;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.Map;
import java.util.Optional;
@Service
public interface CityService {

    ResponseEntity createnewRecord(City city);


    City getRecord(Long id);
}
