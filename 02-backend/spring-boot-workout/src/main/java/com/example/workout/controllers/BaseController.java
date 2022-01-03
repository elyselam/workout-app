package com.example.workout.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BaseController {

    @GetMapping
    public void home() {
        System.out.println("HOME CALLED");
    }
}
