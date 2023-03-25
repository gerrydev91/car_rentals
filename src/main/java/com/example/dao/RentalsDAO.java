package com.example.dao;

import java.util.List;

import com.example.entities.Rentals;

public interface RentalsDAO {

    List<Rentals> findAll();

    boolean deleteById(Long id);

    Rentals findById(Long id);

    Rentals update(Rentals rentals);

    Rentals create (Rentals rentals); 
}
