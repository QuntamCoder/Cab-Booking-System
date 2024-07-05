package com.service;

import java.util.List;

import com.model.Feedback;

public interface FeedbackService {
    Feedback add(Feedback feedback);
    Feedback update(Feedback feedback);
    void delete(Long id);
    Feedback getById(Long id);
    List<Feedback> getAll();
}
