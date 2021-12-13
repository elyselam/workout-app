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
