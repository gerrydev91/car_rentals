package com.example.dao;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.query.Query;


import com.example.entities.Rental;
import com.example.util.HibernateUtil;

public class RentalsDAOImpl implements RentalsDAO{

    @Override
    public List<Rental> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession(); //H
        Query<Rental> query = session.createQuery("from Car", Rental.class);
        List<Rental> rentals = query.list();
        return rentals;
    }

    @Override
    public boolean deleteById(Long id) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            Rental rental = this.findById(id);

            session.delete(rental);

            session.getTransaction().commit();
        }catch (PersistenceException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }finally{
            session.close();
        }

        return true;
    }

    @Override
    public Rental findById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Rental rental = session.find(Rental.class, id);
        session.close();

        return rental;
        
    }

    @Override
    public Rental update(Rental rentals) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Rental create(Rental rentals) {

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
