package com.example.zoo.service;

import com.example.zoo.model.Animals;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalsService {

    List<Animals> animals = new ArrayList<>();

    public List<Animals> get(){

        return animals;
    }
    public Animals add(Animals animal){
        animals.add(animal);
        return animal;
    }
}
