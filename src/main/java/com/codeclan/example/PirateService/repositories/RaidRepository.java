package com.codeclan.example.PirateService.repositories;

import com.codeclan.example.PirateService.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaidRepository extends JpaRepository<Raid, Long> {
}
