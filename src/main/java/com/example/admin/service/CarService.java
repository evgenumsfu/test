package com.example.admin.service;

import com.example.admin.domain.Car;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface CarService {
    Car saveCar(Car car);

    List<Car> getAllCars();
}
