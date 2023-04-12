package com.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="car")
public class Car implements Serializable {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

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
    private int year;

    public Car() {
    }


    public Car(Integer id, String color, String licensePlate, String make, String model, String status, int year) {
        this.id = id;
        this.color = color;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.status = status;
        this.year = year;
    } 


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getLicensePlate() {
        return licensePlate;
    }


    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public String getMake() {
        return make;
    }


    public void setMake(String make) {
        this.make = make;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car [id=" + id + ", color=" + color + ", licensePlate=" + licensePlate + ", make=" + make + ", model="
                + model + ", status=" + status + ", year=" + year + "]";
    }


    

    

}
