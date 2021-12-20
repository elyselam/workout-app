import {Component, Input, OnInit} from '@angular/core';
import {ExerciseDay} from "../../common/exercise-day";
import {Routine} from "../../common/routine";
import {Exercise} from "../../common/exercise";
import {ExerciseDayService} from "../../services/exercise-day-service";
import {RoutineService} from "../../services/routine.service";

@Component({
  selector: 'app-start-workout',
  templateUrl: './start-workout.component.html',
  styleUrls: ['./start-workout.component.css']
})
export class StartWorkoutComponent implements OnInit {
  @Input() exerciseDay: ExerciseDay;
  @Input() routine: Routine; // this is the routine in the []
  @Input() exercise: Exercise;
  constructor(private exerciseDayService: ExerciseDayService, private routineService: RoutineService) { }

  ngOnInit(): void {
    console.log('routine: ', this.routine)
  }

  //

}
