package com.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {}
