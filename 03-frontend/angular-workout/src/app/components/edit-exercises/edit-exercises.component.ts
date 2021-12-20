import {Component, Input, OnInit} from '@angular/core';
import {Exercise} from "../../common/exercise";
import {ExerciseDay} from "../../common/exercise-day";
import {Routine} from "../../common/routine";
import {ExerciseDayService} from "../../services/exercise-day-service";
import {RoutineService} from "../../services/routine.service";

@Component({
  selector: 'app-edit-exercises',
  templateUrl: './edit-exercises.component.html',
  styleUrls: ['./edit-exercises.component.css']
})
export class EditExercisesComponent implements OnInit {
  @Input() exerciseDay: ExerciseDay;
  @Input() routine: Routine; // this is the routine in the []
  @Input() exercise: Exercise;
  constructor(private exerciseDayService: ExerciseDayService, private routineService: RoutineService) { }

  ngOnInit(): void {
  }
  updateRoutine(routine: Routine, exerciseDay: ExerciseDay, exercise: Exercise) {
    console.log(exercise);
    // associate exercise with exerciseDay (but check if exercise inside exerciseDay)
    // for example, you don't want to just .push all the time.
    const newExercise = new Exercise();
    newExercise.exerciseName = exercise.exerciseName;
    console.log('exercise: ', exercise);
    console.log('list: ', exerciseDay.exerciseList);
    console.log(routine.exerciseDayList);
    // exerciseDay.exerciseList.forEach(ex =>  {
    //   console.log(ex.exerciseId, exercise.exerciseId)
    //   if (ex.exerciseId === exercise.exerciseId) {
    //     console.log("exists already, exercise with ID: ", exercise.exerciseId);
    //     // insert logic to update in TYPESCRIPT!!!!!!!! thos specific exercise
    //     // then LATER, update it in the backend
    //     console.log('ex before updates:', ex);
    //     ex = exercise;
    //     console.log('updated ex to have new values: ', ex);
    //   } else {
    //     exerciseDay.exerciseList.push(exercise);
    //   }
    // });
    // find the correct/ exerciseDay within the routine.exerciseDayList and update it in TypeScript


    // then send update Routine request
    this.routineService.updateRoutine(routine).then(response => response);
    //
  }
  addMoreExercises(exerciseDay: ExerciseDay) {
    // this hsould add a new row or a new table beneath the existing exercises
    exerciseDay.exerciseList.push(new Exercise());
  }

  deleteExerciseInput(exerciseDay: ExerciseDay) {
    exerciseDay.exerciseList.pop();
  }

}
