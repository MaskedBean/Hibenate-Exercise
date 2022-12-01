package com.example.Hibenate.Exercise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "classes")
public class SchoolClasses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long classId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;
}
