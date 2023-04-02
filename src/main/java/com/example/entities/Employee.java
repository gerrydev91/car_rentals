package com.example.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employees")

@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "id")),
    @AttributeOverride(name = "firstName", column = @Column(name = "first_name")),
    @AttributeOverride(name = "lastName", column = @Column(name = "last_name")),
    @AttributeOverride(name = "phoneNumber", column = @Column(name = "phone_number")),
    @AttributeOverride(name = "email", column = @Column(name = "email"))
})
public class Employee extends Person  implements Serializable{
    
    @Column(name="salary")
    private Double salary;
    @Column(name="job_title")
    private String jobTitle;




}
