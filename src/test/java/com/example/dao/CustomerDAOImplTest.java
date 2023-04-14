package com.example.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.entities.Customer;

public class CustomerDAOImplTest {

    CustomerDAO customerDao;

    @BeforeEach
    public void setUp() {
        customerDao = new CustomerDAOImpl();


    }

        

    @Test
    void testCreateCustomer() {

        Customer customer = new Customer(null, "Gerardo", "Rivas", "Gerrygerry1@gmail.com", "+63945454545");
        customer = customerDao.createCustomer(customer);

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
    void testFindByLastName() {

    }

    @Test
    void testUpdate() {

    }
}
