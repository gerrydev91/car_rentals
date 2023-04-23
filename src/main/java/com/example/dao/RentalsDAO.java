package com.example.dao;

import java.util.List;

import com.example.entities.Rental;

public interface RentalsDAO {

    List<Rental> findAll();

    boolean deleteById(Long id);

    Rental findById(Long id);

    Rental updateRentalDates(Rental rentals);

    Rental create (Rental rentals); 


    Rental updateRentalCar(Rental rentals);
}
