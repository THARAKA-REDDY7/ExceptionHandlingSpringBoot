package com.example.TestSpring.dao;

import com.example.TestSpring.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends JpaRepository<City, Long>{

}
