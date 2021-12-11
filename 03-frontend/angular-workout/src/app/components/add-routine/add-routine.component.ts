import { Component, OnInit } from '@angular/core';
import {RoutineService} from "../../services/routine.service";
import {Routine} from "../../common/routine";


@Component({
  selector: 'app-add-routine',
  templateUrl: './add-routine.component.html',
  styleUrls: ['./add-routine.component.css']
})
export class AddRoutineComponent implements OnInit {

  routineId: number;
  routineName: string;
  savedRoutines: Routine[]= [];

  constructor(private routineService: RoutineService) {
  }

  ngOnInit(): void {
    this.getRoutine();
  }

  saveRoutines() {
    this.routineService.saveRoutine(new Routine(this.routineName)).then(resp => {
      this.savedRoutines.push(resp);
    })}

  getRoutine(){
      this.routineService.printRoutine().then(resp => {
        this.savedRoutines = resp;
      })
    }




}
