package com.service;

import java.util.List;

import com.model.Vehicle;

public interface VehicleService {
    Vehicle add(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);
    void delete(Long id);
    Vehicle getById(Long id);
    List<Vehicle> getAll();
}
