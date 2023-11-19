package com.tobeto.rent_a_car.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name="colors")
@Entity
public class Color {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String Name;

    @OneToMany(mappedBy = "color") // attribute ismi
    private List<Car> cars;
}
