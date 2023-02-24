package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="car")
public class Car {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 

    @Column(name="color")
    private String color; 

    @Column(name="license_plate")
    private String licensePlate; 

    @Column(name="make")
    private String make; 

    @Column(name="model")
    private String model; 

    @Column(name="status")
    private String status; 


    @Column(name="year")
    private Long year; 

}
