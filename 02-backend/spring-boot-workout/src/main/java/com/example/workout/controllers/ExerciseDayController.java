package com.example.workout.controllers;


import com.example.workout.Services.ExerciseDayService;
import com.example.workout.entity.Exercise;
import com.example.workout.entity.ExerciseDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
        System.out.println("ExerciseDay: " + exerciseDay.getExerciseDayName());
        return exerciseDayService.createExerciseDay(exerciseDay);
    }

    @PutMapping(consumes="application/json", path="/{exerciseDayId}")
    private HttpStatus updateExerciseDay(@RequestBody ExerciseDay exerciseDay, @PathVariable("exerciseDayId") Integer exerciseDayId) {
        return exerciseDayService.updateExerciseDay(exerciseDay, exerciseDayId);
    }

    @DeleteMapping(path="/{exerciseDayId}")
    private HttpStatus deleteExerciseDay(@PathVariable("exerciseDayId") Integer exerciseDayId){
        return exerciseDayService.deleteExerciseDayById(exerciseDayId);
    }

    @GetMapping(path="/{exerciseDayId}")
    private ExerciseDay getOneExerciseDay(@PathVariable("exerciseDayId") Integer exerciseDayId) {
        return exerciseDayService.getOneExerciseDay(exerciseDayId);
    }

}
class CreateExerciseDayRequest {
    private String exerciseName;
    private Integer routineId;
    public CreateExerciseDayRequest(String exerciseName, Integer routineId) {
        this.exerciseName = exerciseName;
        this.routineId = routineId;
    }
}