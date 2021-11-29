package com.example.workout.Services;
import com.example.workout.dao.RoutineRepository;
import com.example.workout.entity.Routine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoutineService {
    @Autowired
    RoutineRepository routineRepository;
    public List<Routine> getRoutines() {
        return routineRepository.findAll();
    }

}
