package com.example.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Session;

import com.example.entities.Customer;
import com.example.util.HibernateUtil;

public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public List<Customer> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public boolean deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Customer findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByLastName'");
    }

    @Override
    public Customer update(Customer customer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Customer createCustomer(Customer customer) {
        

        Session session = HibernateUtil.getSessionFactory().openSession();

        if (session == null){

           System.out.println("The session is null"); 

        }
        
        try {
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
        } catch (PersistenceException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.close();
        return customer;

    
    }
    
}
