package com.example.dao;

import java.util.List;

import com.example.entities.Employee;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(Long id);

    List<Employee> findByLastName(String lastName);

    Employee create (Employee employee);

    Employee update(Employee employee);

    boolean deleteById(Long id);


    
}
