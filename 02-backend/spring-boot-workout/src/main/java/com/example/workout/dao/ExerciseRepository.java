package com.example.workout.dao;

import com.example.workout.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("http://localhost:4200")

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
