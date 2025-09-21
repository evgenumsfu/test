package com.example.admin.controller;


import com.example.admin.domain.Car;
import com.example.admin.service.CarService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        Car newCar = carService.saveCar(car);
        return ResponseEntity.ok(newCar);
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.ok(cars);
    }



}
