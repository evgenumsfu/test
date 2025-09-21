package com.example.admin.service.impl;

import com.example.admin.domain.Car;
import com.example.admin.jpa.CarRepo;
import com.example.admin.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepo carRepo;
    @Override
    @Transactional
    public Car saveCar(Car car) {
        return carRepo.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }
}
