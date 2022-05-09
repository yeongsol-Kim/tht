package com.tht.demo.controller;

import com.tht.demo.domain.Gym;
import com.tht.demo.service.GymService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GymController {

    private final GymService gymService;

    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/gyms/{id}/count")
    public Long getGymCount(@PathVariable Long id) {
        return gymService.getGymCount(id);
    }

    @GetMapping("/gyms/{name}")
    public List<Gym> searchGymByName(@PathVariable String name) {
        return gymService.searchGymByName(name);
    }

//    public Long entranceGym(Long gymId) {
//
//    }
}
