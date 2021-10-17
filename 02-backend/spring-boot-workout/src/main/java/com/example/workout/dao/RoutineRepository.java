package com.example.workout.dao;
import com.example.workout.entity.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "routine", path = "routine-details")
public interface RoutineRepository extends JpaRepository<Routine, Integer> {
}
