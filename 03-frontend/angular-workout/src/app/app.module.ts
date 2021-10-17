import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RoutineListComponent } from './components/routine-list/routine-list.component';
import { RoutineComponent } from './common/routine/routine.component';
import { ExercisesComponent } from './common/exercises/exercises.component';
import {HttpClientModule} from "@angular/common/http";
import {ExerciseService} from "./services/exercise.service";

@NgModule({
  declarations: [
    AppComponent,
    RoutineListComponent,
    RoutineComponent,
    ExercisesComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ExerciseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
