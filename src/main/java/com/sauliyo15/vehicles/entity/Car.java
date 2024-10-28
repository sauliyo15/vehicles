package com.sauliyo15.vehicles.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;
    private String model;
    private Integer mileage;
    private Double price;

    @Column(name = "manufacture_year")
    private Integer year;
    private String description;
    private String colour;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "num_doors")
    private Integer numDoors;
}
