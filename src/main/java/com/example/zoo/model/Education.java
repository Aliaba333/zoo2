package com.example.zoo.model;

import com.example.zoo.utils.enums.EducationDirection;
import com.example.zoo.utils.enums.EducationLevel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private EducationLevel level;
    @Embedded
    private EducationDirection direction;
}
