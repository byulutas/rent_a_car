package com.tobeto.rent_a_car.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Table(name="customers")
@Entity
public class Customer {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="registration_date")
    private Date registration_date;

    @OneToMany(mappedBy = "customer") // attribute ismi
    private List<Rental_Car> rental_cars;
}
