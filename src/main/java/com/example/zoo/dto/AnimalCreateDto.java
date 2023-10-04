package com.example.zoo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AnimalCreateDto {
    private String title;
    private Long animals;
    private Long customer;
    private Long education;
    private Long position;
    private Long region;
    private Long workchart;


}
