package com.example.TestSpring.serviceimpl;

import com.example.TestSpring.ExceptionHandler.NoIdFoundInDb;
import com.example.TestSpring.dao.CityDao;
import com.example.TestSpring.model.City;
import com.example.TestSpring.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CitySeriviceImpl implements CityService {

    @Autowired
    CityDao cityDao;

    @Override
    public ResponseEntity createnewRecord(City city) {
        cityDao.save(city);
        return new ResponseEntity<>("Recored is inserted", HttpStatus.CREATED);
    }

    @Override
    public City getRecord(Long id) {
        return cityDao.findById(id).orElseThrow(
        ()-> new NoIdFoundInDb("id not present",id));

    }


}


