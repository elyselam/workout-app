package com.example.workout.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "routine_table")
@Getter
@Setter

public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "routine_name")
    private String routineName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "routine")
    private Set<Exercise> exercises;
}
