package com.example.entities;


import java.time.LocalDateTime;

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
public class Rentals {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @OneToOne
    @Column(name="car")
    private Car car; 

    @ManyToOne
    @JoinColumn(name="")
    private Customer customer; 
    @Column(name="rentalCost")
    private Double rentalCost;

    @Column(name="rentalStart")
    private LocalDateTime rentalStart; 

    @Column(name="RentalEnd")
    private LocalDateTime rentalEnd; 

}
