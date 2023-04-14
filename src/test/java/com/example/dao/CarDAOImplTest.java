package com.example.dao;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.example.entities.Car;

public class CarDAOImplTest {

CarDAO carDao; 

@BeforeEach
public  void setUp() {
        carDao = new CarDAOImpl();
    }


    @Test
    public void testCreateCar() {

        Car car = new Car (null, "Red", "P-3B3B3B","Toyota" ,"Land Cruiser", "Available", 2022);
        carDao = new CarDAOImpl();
        carDao.createCar(car);
        System.out.println(car.toString());


        

    }

    @Test
    public void testDeleteById() {

        

    }

    @Test
    public void testDeleteByLicensePlate() {

    }

    @Test
    public void FindAll() {

        List<Car> cars = carDao.findAll();
        for(Car car : cars){
            System.out.println(car.getColor());
        }

    }

    @Test
    public void testFindById() {

    }

    @Test
    public void testFindByPlate() {

    }

    @Test
    public void testUpdate() {

    }
}
