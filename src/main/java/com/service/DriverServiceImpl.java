package com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DriverRepository;
import com.model.Driver;


@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver add(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver update(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public void delete(Long id) {
        driverRepository.deleteById(id);
    }

    @Override
    public Driver getById(Long id) {
        return driverRepository.findById(id).orElse(null);
    }

    @Override
    public List<Driver> getAll() {
        return driverRepository.findAll();
    }
}