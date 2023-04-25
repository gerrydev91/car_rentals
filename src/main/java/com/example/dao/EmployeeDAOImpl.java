package com.example.dao;

import java.util.List;

import javax.persistence.PersistenceException;
import javax.persistence.criteria.*;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.example.entities.Employee;
import com.example.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public List<Employee> findAll() {
       
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.list();
        return employees;

    }

    @Override
    public Employee findById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Employee employee = session.find(Employee.class, id);
        session.close();

        return employee;
    }

    @Override
    public List<Employee> findByLastName(String lastName) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Employee> criteria = builder.createQuery(Employee.class);

        Root<Employee> root = criteria.from(Employee.class);

        Predicate filter = builder.like(root.get("lastName").as
        (String.class), "%" + lastName + "%");
        
        criteria.select(root).where(filter);

        List<Employee> employees =  session.createQuery(criteria).list();

        session.close();

        return employees; 




    }

    @Override
    public Employee createEmployee(Employee employee) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        if (session == null){

           System.out.println("The session is null"); 

        }
        
        try {
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } catch (PersistenceException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        session.close();
        return employee;

    }

    @Override
    public Employee update(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean deleteById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try{

            session.beginTransaction();

            Employee employee = this.findById(id);
            session.delete(employee);

            session.getTransaction().commit();

        } catch(PersistenceException e){
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;

        }finally{
            session.close();
        }
        
        return true;
    }
    
}
