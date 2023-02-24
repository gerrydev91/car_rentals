package com.example.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rentals")
public class Rentals {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(name="car")
    private Car car; 

    @ManyToOne
    @JoinColumn(name="")
    private Customer customer; 
    @Column(name="rentalCost")
    private Double rentalCost;

    @Column(name="rentalStart")
    private LocalDate rentalStart; 

    @Column(name="RentalEnd")
    private LocalDate rentalEnd; 

}
