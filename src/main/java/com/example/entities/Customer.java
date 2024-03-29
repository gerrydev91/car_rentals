package com.example.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="customers")

@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "id")),
    @AttributeOverride(name = "firstName", column = @Column(name = "first_name")),
    @AttributeOverride(name = "lastName", column = @Column(name = "last_name")),
    @AttributeOverride(name = "phoneNumber", column = @Column(name = "phone_number")),
    @AttributeOverride(name = "email", column = @Column(name = "email"))
})
public class Customer extends  Person implements Serializable{

    public Customer() {
    }

    public Customer(Long id, String email, String firstName, String lastName, String phoneNumber) {
        super(id, email, firstName, lastName, phoneNumber);
    }

    

    
    
}
