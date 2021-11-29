import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RoutineListComponent } from './components/routine-list/routine-list.component';

import {HttpClientModule} from "@angular/common/http";
import {ExerciseService} from "./services/exercise.service";
import { ExerciseListComponent } from './components/exercise-details/exercise-list.component';
import {RoutineService} from "./services/routine.service";

@NgModule({
  declarations: [
    AppComponent,
    RoutineListComponent,

    ExerciseListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,

  ],
  providers: [ExerciseService, RoutineService],
  bootstrap: [AppComponent]
})
export class AppModule { }
