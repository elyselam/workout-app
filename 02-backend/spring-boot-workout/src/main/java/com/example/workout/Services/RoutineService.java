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

    public Routine createRoutine(Routine routine) {
        return routineRepository.save(routine);
    }

    public Routine updateRoutine(Routine routine) {
        Routine newRoutine = routineRepository.getById(routine.getRoutineId());
        newRoutine.setRoutineId(routine.getRoutineId());
        newRoutine.setRoutineName(routine.getRoutineName());
        //newRoutine.setExerciseDayList(routine.getExerciseDayId());
        return routineRepository.save(newRoutine);
    }


    public HttpStatus deleteRoutineById(Integer routineId) {
        routineRepository.deleteById(routineId);
        return HttpStatus.ACCEPTED;
    }
    public Routine getOneRoutine(Integer routineId) {
        return routineRepository.getById(routineId);
    }


}
