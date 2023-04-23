package com.example.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.entities.Employee;
import com.example.dao.EmployeeDAO;

public class EmployeeDAOImplTest {

    EmployeeDAO employeeDao;

    @BeforeEach
    public void setUp() {
        
        employeeDao = new EmployeeDAOImpl();


    }

    @Test
    void testCreateEmployee() {

        Employee employee = new Employee(null, "Gerry9191test2@gmail.com", "Laura Fernanda", 
        "Rivas Romero", "898989", 3000.0d, "Cloud Engineer");

        employee = employeeDao.createEmployee(employee);

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
