package com.service;

import java.util.List;

import com.model.Booking;

public interface BookingService {
    Booking add(Booking booking);
    Booking update(Booking booking);
    void delete(Long id);
    Booking getById(Long id);
    List<Booking> getAll();
}
