package com.example.workout.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercise_day")
public class ExerciseDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_day_id")
    private Integer exerciseDayId;

    @Column(name = "exercise_day_name")
    private String exerciseDayName;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    @JsonBackReference
    private Routine routine;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exerciseDay")
    private List<Exercise> exerciseList;

    public ExerciseDay() {
    }

    public Integer getExerciseDayId() {
        return exerciseDayId;
    }

    public void setExerciseDayId(Integer exerciseDayId) {
        this.exerciseDayId = exerciseDayId;
    }

    public String getExerciseDayName() {
        return exerciseDayName;
    }

    public void setExerciseDayName(String exerciseDayName) {
        this.exerciseDayName = exerciseDayName;
    }

    public Routine getRoutine() {
        return routine;
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }
}
