package com.example.zoo.dto;

import com.example.zoo.model.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AnimalDto {
    private Long id;
    private String title;
    private Animals animals;
    private Customer customer;
    private Education education;
    private Position position;
    private Region region;
    private WorkChart workChart;

}
