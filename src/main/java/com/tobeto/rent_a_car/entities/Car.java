package com.tobeto.rent_a_car.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="cars")
@Entity
public class Car
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="model_year")
    private int modelYear;

    @Column(name="model_name")
    private String modelName;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="color_id")
    private Brand color;

    @OneToMany(mappedBy = "car") // attribute ismi
    private List<Rental_Car> rental_cars;


}
