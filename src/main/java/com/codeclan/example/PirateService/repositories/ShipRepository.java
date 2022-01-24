package com.codeclan.example.PirateService.repositories;

import com.codeclan.example.PirateService.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository extends JpaRepository<Ship, Long> {

}
