import {Component, Input, OnInit} from '@angular/core';
import {ExerciseDay} from "../../common/exercise-day";
import {ExerciseDayService} from "../../services/exercise-day-service";
import {RoutineService} from "../../services/routine.service";
import {Routine} from "../../common/routine";
import {Exercise} from "../../common/exercise";



@Component({
  selector: 'app-add-exercise-day',
  templateUrl: './add-exercise-day.component.html',
  styleUrls: ['./add-exercise-day.component.css']
})


export class AddExerciseDayComponent implements OnInit {
  exerciseDayId: number;
  exerciseDayName: string;
  savedExerciseDays: ExerciseDay[] = [];
  routineId : number;
  @Input() routine : Routine;


  exercise: string;
  



  constructor(private exerciseDayService: ExerciseDayService, private routineService: RoutineService) { }

  ngOnInit(): void {

  }


  getExerciseDays() {
    this.exerciseDayService.printExerciseDay().then(resp => {
      this.savedExerciseDays = resp;
    })
  }

  saveToRoutine() {
    const newExDay = new ExerciseDay();
    newExDay.exerciseDayName = this.exerciseDayName;
    this.routine.exerciseDayList.push(newExDay);
    this.routineService.updateRoutine(this.routine).then(done => done);
  }







}
