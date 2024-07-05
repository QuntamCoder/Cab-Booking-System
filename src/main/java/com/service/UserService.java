package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
    User add(User user);
    User update(User user);
    void delete(Long id);
    User getById(Long id);
    List<User> getAll();
}
