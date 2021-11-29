package com.example.workout.controllers;

import com.example.workout.Services.RoutineService;
import com.example.workout.entity.Routine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
