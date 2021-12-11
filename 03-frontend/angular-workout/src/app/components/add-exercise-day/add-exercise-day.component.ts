import { Component, OnInit } from '@angular/core';
import {ExerciseDay} from "../../common/exercise-day";
import {ExerciseDayService} from "../../services/exercise-day-service";

@Component({
  selector: 'app-add-exercise-day',
  templateUrl: './add-exercise-day.component.html',
  styleUrls: ['./add-exercise-day.component.css']
})
export class AddExerciseDayComponent implements OnInit {
  exerciseDayId: number;
  exerciseDayName: string;
  savedExerciseDays: ExerciseDay[] = [];
  routineId = 7;
  constructor(private exerciseDayService: ExerciseDayService) { }

  ngOnInit(): void {
    this.getExerciseDays();
  }
  saveExerciseDays() {
    this.exerciseDayService.saveExerciseDay(new ExerciseDay(this.exerciseDayName, this.routineId)).then(resp=> {
      this.savedExerciseDays.push(resp);
    })
  }

  getExerciseDays() {
    this.exerciseDayService.printExerciseDay().then(resp => {
      this.savedExerciseDays = resp;
    })
  }

  saveRoutines() {

  }
}
