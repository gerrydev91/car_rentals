package com.example.dao;

import java.util.List;

import com.example.entities.Car;

public interface CarDAO {
    
    List<Car> findAll();

    Car findByPlate(String plate);

    Car findById(Long id);

    Car update(Long id);

    Car createCar(Car car);

    boolean deleteByLicensePlate(); 

    boolean deleteById(); 

    
}
