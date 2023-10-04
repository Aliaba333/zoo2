package com.example.zoo.mapper;

import com.example.zoo.dto.AnimalCreateDto;
import com.example.zoo.dto.AnimalDto;
import com.example.zoo.model.Animals;
import lombok.Getter;
import lombok.Setter;


public class AnimalMapper {
    public static Animals toAnimal(AnimalCreateDto animalCreateDto){
        return Animals.builder()
                .higth(animalCreateDto.getHigth())
                .wigth(animalCreateDto.getwigth())
                .age(animalCreateDto.getage())
                .build();


    }
    public static AnimalDto animalDto(Animals animal){
        AnimalDto animalDto = AnimalDto.builder()
                .id(animal.getId())
                .title(animal.gettitle())
                .higth(animalCreateDto. gethigth())
                .wigth(animalCreateDto. getwigth())
                .age(animalCreateDto. getage())
                .build();
        return animalDto;
    }
}
