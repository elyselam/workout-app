package com.example.workout.Services;


import com.example.workout.dao.ExerciseRepository;
import com.example.workout.entity.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;

    public List<Exercise> getExercises() {
        return exerciseRepository.findAll();
    }

    public HttpStatus createExercise(Exercise exercise) {
        exerciseRepository.save(exercise);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus updateExercise(Exercise exercise) {
        Exercise exercise1 = exerciseRepository.getById(exercise.getExerciseID());
        exercise1.setExerciseID(exercise.getExerciseID());
        exercise1.setExerciseName(exercise.getExerciseName());
        exercise1.setStartingWeight(exercise.getStartingWeight());
        exercise1.setIncWeightBy(exercise.getIncWeightBy());
        exercise1.setSet1(exercise.getSet1());
        exercise1.setSet2(exercise.getSet2());
        exercise1.setSet3(exercise.getSet3());
        exercise1.setSet4(exercise.getSet4());
        exercise1.setRepsAccomplished(exercise.isRepsAccomplished());
        exerciseRepository.save(exercise1);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus deleteExercise(Integer exerciseId) {
        exerciseRepository.deleteById(exerciseId);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus getOneExercise(Integer exerciseId){
        exerciseRepository.getById(exerciseId);
        return HttpStatus.ACCEPTED;
    }


}
