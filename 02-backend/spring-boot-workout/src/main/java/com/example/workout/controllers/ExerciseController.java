package com.example.workout.controllers;


import com.example.workout.Services.ExerciseService;
import com.example.workout.entity.Exercise;
import com.example.workout.entity.ExerciseDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path= "api/exercise")
public class ExerciseController {
    @Autowired
    ExerciseService exerciseService;

    @GetMapping
    private List<Exercise> getExercises() {
        return exerciseService.getExercises();
    }

    @PostMapping(consumes = "application/json")
    public HttpStatus createExercise(@RequestBody Exercise exercise){
        return exerciseService.createExercise(exercise);

    }
    @PutMapping(consumes="application/json", path="/{exerciseId}")
    public HttpStatus updateExercise(@RequestBody Exercise exercise, @PathVariable("exerciseId") Integer exerciseId){
        return exerciseService.updateExercise(exercise, exerciseId);
    }

    @DeleteMapping(path="/{exerciseId}")
    public HttpStatus deleteExercise(@PathVariable("exerciseId") Integer exerciseId) {
        return exerciseService.deleteExercise(exerciseId);
    }

    @GetMapping(path="/{exerciseId}")
    public Exercise getOneExercise(@PathVariable("exerciseId") Integer exerciseId){
        return exerciseService.getOneExercise(exerciseId);
    }

}
