package com.example.workout.controllers;

import com.example.workout.Services.RoutineService;
import com.example.workout.entity.Routine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/routine")
public class RoutineController {
    @Autowired
    RoutineService routineService;
    @GetMapping
    private List<Routine> getRoutines() {
        return routineService.getRoutines();
    }


    @PostMapping(consumes = "application/json")
    public HttpStatus createRoutine(@RequestBody Routine routine){
        return routineService.createRoutine(routine);
    }

    @PutMapping(consumes = "application/json")
    private HttpStatus updateRoutine(@RequestBody Routine routine) {
        return routineService.updateRoutine(routine);
    }

    @DeleteMapping(path="/{routineId}")
    private HttpStatus deleteRoutine(@PathVariable("routineId") Integer routine) {
        return routineService.deleteRoutineById(routine);
    }

    @GetMapping(path="/{routineId}")
    private HttpStatus getOneRoutine(@PathVariable("routineId") Integer routineId) {
        return routineService.getOneRoutine(routineId);
    }

}
