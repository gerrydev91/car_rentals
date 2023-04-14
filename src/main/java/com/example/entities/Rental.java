package com.example.entities;


import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rentals")
public class Rental {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="car_id")
    private Car car; 

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer; 
    @Column(name="rentalCost")
    private Double rentalCost;

    @Column(name="rentalStart")
    private LocalDateTime rentalStart; 

    @Column(name="RentalEnd")
    private LocalDateTime rentalEnd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(Double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public LocalDateTime getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(LocalDateTime rentalStart) {
        this.rentalStart = rentalStart;
    }

    public LocalDateTime getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(LocalDateTime rentalEnd) {
        this.rentalEnd = rentalEnd;
    }

    public Rental(Long id, Car car, Customer customer, Double rentalCost, LocalDateTime rentalStart,
            LocalDateTime rentalEnd) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.rentalCost = rentalCost;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
    }

    public Rental() {
    } 


    

    

    

}
