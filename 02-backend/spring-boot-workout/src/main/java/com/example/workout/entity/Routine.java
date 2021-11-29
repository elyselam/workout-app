package com.example.workout.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "routine")
@Getter
@Setter

public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id")
    private Integer routineId;

    @Column(name = "routine_name")
    private String routineName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exerciseDayId")
    private List<ExerciseDay> exerciseDay;
}


