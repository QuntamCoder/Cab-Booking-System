package com.service;

import java.util.List;

import com.model.Admin;

public interface AdminService {
    Admin add(Admin admin);
    Admin update(Admin admin);
    void delete(Long id);
    Admin getById(Long id);
    List<Admin> getAll();
}
