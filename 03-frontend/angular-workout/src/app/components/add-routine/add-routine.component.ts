import {Component, OnInit} from '@angular/core';
import {RoutineService} from "../../services/routine.service";
import {Routine} from "../../common/routine";
import {ExerciseDay} from "../../common/exercise-day";
import {Exercise} from "../../common/exercise";


@Component({
  selector: 'app-add-routine',
  templateUrl: './add-routine.component.html',
  styleUrls: ['./add-routine.component.css']
})
export class AddRoutineComponent implements OnInit {

  routineId: number;
  routineName: string;
  savedRoutines: Routine[] = [];

  constructor(private routineService: RoutineService) {
  }

  ngOnInit(): void {
    this.getRoutine();
  }

  saveRoutines() {
    this.routineService.saveRoutine(new Routine(this.routineName)).then(resp => {
      this.savedRoutines.push(resp);
    })
  }

  getRoutine() {
    this.routineService.printRoutine().then(resp => {
      this.savedRoutines = resp;
    })
  }

  updateRoutine(routine: Routine, exerciseDay: ExerciseDay, exercise: Exercise) {
    console.log(exercise);
    // associate exercise with exerciseDay (but check if exercise inside exerciseDay)
    // for example, you don't want to just .push all the time.

    exerciseDay.exerciseList.forEach(ex =>  {

      if (ex.exerciseId === exercise.exerciseId) {
        console.log("exists already, exercise with ID: ", exercise.exerciseId);
        // insert logic to update in TYPESCRIPT!!!!!!!! thos specific exercise
        // then LATER, update it in the backend
      } else {
        exerciseDay.exerciseList.push(ex);
      }
    });
    //   if ()
    //   console.log("exercise already exists");
    // } else {
    //     exerciseDay.exerciseList.push(exercise);
    //   }
    // if (ExerciseDay exerciseDay in routine.exerciseDayList) {
    //   console.log("exerciseDay already exists");
    // } else {
    //   routine.exerciseDayList.push(exerciseDay);
    // }


    // find the correct/ exerciseDay within the routine.exerciseDayList and update it in TypeScript


    // then send update Routine request
   //
  }
}
