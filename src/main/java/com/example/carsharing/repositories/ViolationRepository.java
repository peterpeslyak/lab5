package com.example.carsharing.repositories;

import com.example.carsharing.entities.Violation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViolationRepository extends JpaRepository<Violation, Long> {
}
