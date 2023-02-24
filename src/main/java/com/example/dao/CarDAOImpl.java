package com.example.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.example.entities.Car;
import com.example.util.HibernateUtil;

public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession(); //H
        Query<Car> query = session.createQuery("from Car", Car.class);
        List<Car> cars = query.list();
        session.close();
        return cars;
     
    }

    @Override
    public Car findByPlate(String plate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Car car = session.find(Car.class, plate);
        session.close();
        return car;
        

        
    }

    @Override
    public Car findById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Car update(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Car createCar(Car car) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCar'");
    }

    @Override
    public boolean deleteByLicensePlate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByLicensePlate'");
    }

    @Override
    public boolean deleteById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
}
