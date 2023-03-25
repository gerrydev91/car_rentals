package com.example.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.example.entities.Car;

public class CarDAOImplTest {

CarDAO carDao; 

@Before
public  void setUp() {
        carDao = new CarDAOImpl();
    }


    @Test
    public void testCreateCar() {

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
