package com.example.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.query.Query;


import com.example.entities.Rentals;
import com.example.util.HibernateUtil;

public class RentalsDAOImpl implements RentalsDAO{

    @Override
    public List<Rentals> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession(); //H
        Query<Rentals> query = session.createQuery("from Car", Rentals.class);
        List<Rentals> rentals = query.list();
        return rentals;
    }

    @Override
    public boolean deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Rentals findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Rentals update(Rentals rentals) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Rentals create(Rentals rentals) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            session.save(rentals);
            session.getTransaction().commit();
        }catch (PersistenceException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.close();
        return rentals;
        
    }
    
}
