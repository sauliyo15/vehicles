package com.sauliyo15.vehicles.service;

import com.sauliyo15.vehicles.entity.Car;
import com.sauliyo15.vehicles.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Integer id) {
        return carRepository.findById(id);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Integer id, Car carDetails) {
        return carRepository.findById(id).map(car -> {
            car.setBrand(carDetails.getBrand());
            car.setModel(carDetails.getModel());
            car.setMileage(carDetails.getMileage());
            car.setPrice(carDetails.getPrice());
            car.setYear(carDetails.getYear());
            car.setDescription(carDetails.getDescription());
            car.setColour(carDetails.getColour());
            car.setFuelType(carDetails.getFuelType());
            car.setNumDoors(carDetails.getNumDoors());
            return carRepository.save(car);
        }).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    public void deleteCar(Integer id) {
        carRepository.deleteById(id);
    }
}
