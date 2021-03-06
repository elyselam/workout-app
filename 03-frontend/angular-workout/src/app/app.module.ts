import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RoutineListComponent } from './components/routine-list/routine-list.component';

import {HttpClientModule} from "@angular/common/http";
import {ExerciseService} from "./services/exercise.service";

import {RoutineService} from "./services/routine.service";
import { AddRoutineComponent } from './components/add-routine/add-routine.component';
import {FormsModule} from "@angular/forms";
import { AddExerciseDayComponent } from './components/add-exercise-day/add-exercise-day.component';
import { EditExercisesComponent } from './components/edit-exercises/edit-exercises.component';
import { StartWorkoutComponent } from './components/start-workout/start-workout.component';

@NgModule({
  declarations: [
    AppComponent,
    RoutineListComponent,
   AddRoutineComponent,
   AddExerciseDayComponent,
   EditExercisesComponent,
   StartWorkoutComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [ExerciseService, RoutineService],
  bootstrap: [AppComponent]
})
export class AppModule { }
