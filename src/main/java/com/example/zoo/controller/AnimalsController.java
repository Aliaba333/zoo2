package com.example.zoo.controller;

import com.example.zoo.model.Animals;
import com.example.zoo.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalsController {

    private final AnimalsService animalsService;

    @Autowired
    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @GetMapping
    public List<Animals> getAll() {
        return animalsService.get();
    }
    @PatchMapping
    public Animals addAnimals(@RequestBody Animals animals){
        return animalsService.add(animals);
    }

}
