package com.example.workout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable=false, insertable=false, updatable=false)
    @JsonIgnore
    private Routine routine;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exerciseID")
    private List<Exercise> exerciseID;
}
