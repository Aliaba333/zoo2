package com.example.zoo.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="animal")
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private Double heigth;
    private Double weigth;
    private Double age;
    @ManyToOne
    private Region region;
}
