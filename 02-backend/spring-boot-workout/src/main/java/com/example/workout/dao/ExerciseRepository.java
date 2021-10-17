package com.example.workout.dao;

import com.example.workout.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;



@CrossOrigin("http://localhost:4200")

//collectionResourceRel = name_of_json_entry
@RepositoryRestResource(collectionResourceRel = "exercise", path = "exercise-details")
public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
