package com.tht.demo.repository;

import com.tht.demo.domain.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GymRepository extends JpaRepository<Gym, Long> {
    List<Gym> findByNameContaining(String name);
}
