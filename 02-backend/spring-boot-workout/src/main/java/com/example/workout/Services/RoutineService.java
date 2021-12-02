package com.example.workout.Services;
import com.example.workout.dao.RoutineRepository;
import com.example.workout.entity.Routine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RoutineService {
    @Autowired
    RoutineRepository routineRepository;

    public List<Routine> getRoutines() {
        return routineRepository.findAll();
    }
    public Routine getOneRoutine(Routine routine) {
        return routineRepository.getById(routine.getRoutineId());
    }

    public HttpStatus updateRoutine(Routine routine) {
        Routine newRoutine = routineRepository.getById(routine.getRoutineId());
        newRoutine.setRoutineId(routine.getRoutineId());
        newRoutine.setRoutineName(routine.getRoutineName());
        //newRoutine.setExerciseDayList(routine.getExerciseDayId());
        routineRepository.save(newRoutine);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus deleteRoutine(Routine routine) {
        routineRepository.delete(routine);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus createRoutine(Routine routine) {

        routineRepository.save(routine);
        System.out.println(routine.getRoutineName());
        return HttpStatus.ACCEPTED;
    }



}
