package com.example.dao;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.entities.Employee;

public class EmployeeDAOImplTest {

    EmployeeDAO employeeDao;

    @BeforeEach
    public void setUp() {
        
        employeeDao = new EmployeeDAOImpl();


    }

    @Test
    void testCreateEmployee() {

        Employee employee = new Employee(null, "Gerry9191test@gmail.com", "Laura Fernanda", 
        "Rivas Romero", "898989", 3000.0d, "Cloud Engineer");

        Employee employee2 = new Employee(null, "Gerry9191test1@gmail.com", "Beto Gerry", 
        "Rivas M", "898989", 3000.0d, "Cloud Engineer");

        employee = employeeDao.createEmployee(employee);
        employee2 = employeeDao.createEmployee(employee2);

    }

    @Test
    void testDeleteById() {

    }

    @Test
    void testFindAll() {

        List<Employee> employees = employeeDao.findAll();
        System.out.println(employees);

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
