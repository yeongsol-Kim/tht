package com.tht.demo.service;

import com.tht.demo.domain.Gym;
import com.tht.demo.repository.GymRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GymService {

    private final GymRepository gymRepository;

    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    public Long getGymCount(Long gymId) {
        Gym gym = gymRepository.findById(gymId).orElse(null);

        return gym.getCount();
    }

    public List<Gym> searchGymByName(String name) {
        return gymRepository.findByNameContaining(name);
    }

//    public Long entranceGym(Long gymId) {
//
//    }
}
