package com.example.dao;

import java.util.List;

import com.example.entities.Customer;

public interface CustomerDAO {
    
    List<Customer> findAll(); 

    boolean deleteById (Long id);

    Customer findById(Long id);


    List<Customer> findByLastName(String lastName); 


    Customer update(Customer customer); 


}
