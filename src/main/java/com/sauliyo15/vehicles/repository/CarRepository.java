package com.sauliyo15.vehicles.repository;

import com.sauliyo15.vehicles.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
