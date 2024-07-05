package com.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {}
