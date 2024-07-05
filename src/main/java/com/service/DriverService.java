package com.service;

import java.util.List;

import com.model.Driver;

public interface DriverService {
    Driver add(Driver driver);
    Driver update(Driver driver);
    void delete(Long id);
    Driver getById(Long id);
    List<Driver> getAll();
}
