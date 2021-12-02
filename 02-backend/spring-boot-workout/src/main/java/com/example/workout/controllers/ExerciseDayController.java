package com.example.workout.controllers;


import com.example.workout.Services.ExerciseDayService;
import com.example.workout.entity.ExerciseDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/exerciseDay")
public class ExerciseDayController {
    @Autowired
    ExerciseDayService exerciseDayService;

    @GetMapping
    private List<ExerciseDay> getExerciseDays() {
        return exerciseDayService.getExerciseDays();
    }

    @PostMapping(consumes = "application/json")
    public HttpStatus createExerciseDay(@RequestBody ExerciseDay exerciseDay) {
        return exerciseDayService.createExerciseDay(exerciseDay);
    }

    @PutMapping(consumes="application/json")
    private HttpStatus updateExerciseDay(@RequestBody ExerciseDay exerciseDay) {
        return exerciseDayService.updateExerciseDay(exerciseDay);
    }

    @DeleteMapping(path="/{exerciseDayId}")
    private HttpStatus deleteExerciseDay(@PathVariable("exerciseDayId") Integer exerciseDayId){
        return exerciseDayService.deleteExerciseDayById(exerciseDayId);
    }

    @GetMapping(path="/{exerciseDayId}")
    private HttpStatus getOneExerciseDay(@PathVariable("exerciseDayId") Integer exerciseDayId) {
        return exerciseDayService.getOneExerciseDay(exerciseDayId);
    }

}
