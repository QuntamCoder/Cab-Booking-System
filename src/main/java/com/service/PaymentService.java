package com.service;

import java.util.List;

import com.model.Payment;

public interface PaymentService {
    Payment add(Payment payment);
    Payment update(Payment payment);
    void delete(Long id);
    Payment getById(Long id);
    List<Payment> getAll();
}
