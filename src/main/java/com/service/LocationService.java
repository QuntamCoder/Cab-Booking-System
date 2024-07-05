package com.service;

import java.util.List;

import com.model.Location;

public interface LocationService {
    Location add(Location location);
    Location update(Location location);
    void delete(Long id);
    Location getById(Long id);
    List<Location> getAll();
}
