package com.tobeto.rent_a_car.entities;

import jakarta.persistence.*;

import java.util.Date;

public class Rental_Car {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="delivered_kilometer")
    private int delivered_kilometer;

    @Column(name="rented_kilometer")
    private String rented_kilometer;

    @Column(name="start_date")
    private Date start_date;

    @Column(name="finish_date")
    private Date finish_date;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
}
