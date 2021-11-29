package com.example.workout.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercise_day")
@Getter
@Setter

public class ExerciseDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_day_id")
    private Integer exerciseDayId;

    @Column(name = "exercise_day_name")
    private String exerciseDayName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "routine_id", nullable=false)
    private Routine routineID;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exerciseID")
    private List<Exercise> exerciseID;
}
