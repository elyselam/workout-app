package com.example.workout.Services;


import com.example.workout.dao.ExerciseDayRepository;
import com.example.workout.dao.RoutineRepository;
import com.example.workout.entity.ExerciseDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseDayService {
    @Autowired
    ExerciseDayRepository exerciseDayRepository;

    public List<ExerciseDay> getExerciseDays(){
        return exerciseDayRepository.findAll();
    }
    public HttpStatus createExerciseDay(ExerciseDay exerciseDay) {

        exerciseDayRepository.save(exerciseDay);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus updateExerciseDay(ExerciseDay exerciseDay, Integer exerciseDayId) {
        ExerciseDay newExerciseDay = exerciseDayRepository.getById(exerciseDayId);
//        newExerciseDay.setExerciseDayId(exerciseDay.getExerciseDayId());
        newExerciseDay.setExerciseDayName(exerciseDay.getExerciseDayName());
        exerciseDayRepository.save(newExerciseDay);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus deleteExerciseDayById(Integer exerciseDayId){
        exerciseDayRepository.deleteById(exerciseDayId);
        return HttpStatus.ACCEPTED;
    }

    public HttpStatus deleteExerciseDays(){
        exerciseDayRepository.deleteAll();
        return HttpStatus.ACCEPTED;
    }

    public ExerciseDay getOneExerciseDay(Integer exerciseDayId){
        return exerciseDayRepository.getById(exerciseDayId);

    }


}
