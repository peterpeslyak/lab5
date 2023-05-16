package com.example.carsharing.repositories;

import com.example.carsharing.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long>{

}
