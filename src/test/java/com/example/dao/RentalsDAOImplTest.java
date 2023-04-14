package com.example.dao;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.entities.Car;
import com.example.entities.Customer;
import com.example.entities.Rental;

public class RentalsDAOImplTest {

    RentalsDAO rentalsDAO;

    @BeforeEach
    public void setUp() {
        rentalsDAO = new RentalsDAOImpl();
    }

    @Test
    void testCreate() {

        Customer customer = new Customer(null, "Gerardo", "Rivas", "Gerrygerry1@gmail.com", "+63945454545");
        Car car = new Car(null, "Red", "P-3B3B3B", "Toyota", "Land Cruiser", "Available", 2022);

        LocalDateTime dateTimeStart = LocalDateTime.of(2023, 4, 14, 15, 30, 45);
        LocalDateTime dateTimeEnd = LocalDateTime.of(2023, 4, 17, 15, 30, 45);

        Rental rental = new Rental(null, car, customer, 29.99d, dateTimeStart, dateTimeEnd);

        rental = rentalsDAO.create(rental);

    }

    @Test
    void testDeleteById() {

    }

    @Test
    void testFindAll() {

    }

    @Test
    void testFindById() {

    }

    @Test
    void testUpdate() {

    }
}
