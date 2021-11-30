package com.example.workout.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "routine")

public class Routine {
    public Integer getRoutineId() {
        return routineId;
    }

    public void setRoutineId(Integer routineId) {
        this.routineId = routineId;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public List<ExerciseDay> getExerciseDayId() {
        return exerciseDayList;
    }

    public void setExerciseDayList(List<ExerciseDay> exerciseDayList) {
        this.exerciseDayList= exerciseDayList;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id")
    private Integer routineId;

    @Column(name = "routine_name")
    private String routineName;

    public Routine() {
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "routine")

    private List<ExerciseDay> exerciseDayList;
}


