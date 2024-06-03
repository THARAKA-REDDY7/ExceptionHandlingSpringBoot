package com.example.TestSpring.Controller;

import com.example.TestSpring.model.City;
import com.example.TestSpring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    CityService cityService;
    @PostMapping("/add")
    public ResponseEntity<String> createnewRecord(@RequestBody City city){
        //System.out.println(city.getId());
        //System.out.println(city.getCityName());
        // System.out.println(city.getState());
        cityService.createnewRecord(city);


        return new ResponseEntity("Record is inserted successfully", HttpStatus.CREATED);
    }
   @GetMapping("/get/{Id}")
    public City getRecord(@PathVariable Long Id){

        return cityService.getRecord(Id);
    }


}
