package com.example.workout.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private Integer exerciseID;

    @ManyToOne
    @JoinColumn(name = "exercise_day_id", insertable = false, updatable = false, nullable=false)
    @JsonIgnore //need this to prevent infinite loops
    private ExerciseDay exerciseDay;

    @Column(name = "exercise_name")
    private String exerciseName;

    @Column(name = "starting_weight")
    private Integer startingWeight;

    @Column(name = "inc_weight_by")
    private Integer incWeightBy;

    @Column(name = "set_1")
    private Integer set1;

    @Column(name = "set_2")
    private Integer set2;

    @Column(name = "set_3")
    private Integer set3;

    @Column(name = "set_4")
    private Integer set4;

    @Column(name = "reps_accomplished")
    private boolean repsAccomplished;

    public Exercise() {
    }

    public Integer getExerciseID() {
        return exerciseID;
    }

    public void setExerciseID(Integer exerciseID) {
        this.exerciseID = exerciseID;
    }

    public ExerciseDay getExerciseDay() {
        return exerciseDay;
    }

    public void setExerciseDay(ExerciseDay exerciseDay) {
        this.exerciseDay = exerciseDay;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Integer getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(Integer startingWeight) {
        this.startingWeight = startingWeight;
    }

    public Integer getIncWeightBy() {
        return incWeightBy;
    }

    public void setIncWeightBy(Integer incWeightBy) {
        this.incWeightBy = incWeightBy;
    }

    public Integer getSet1() {
        return set1;
    }

    public void setSet1(Integer set1) {
        this.set1 = set1;
    }

    public Integer getSet2() {
        return set2;
    }

    public void setSet2(Integer set2) {
        this.set2 = set2;
    }

    public Integer getSet3() {
        return set3;
    }

    public void setSet3(Integer set3) {
        this.set3 = set3;
    }

    public Integer getSet4() {
        return set4;
    }

    public void setSet4(Integer set4) {
        this.set4 = set4;
    }

    public boolean isRepsAccomplished() {
        return repsAccomplished;
    }

    public void setRepsAccomplished(boolean repsAccomplished) {
        this.repsAccomplished = repsAccomplished;
    }
}
