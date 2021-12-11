import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ExerciseDay} from "../common/exercise-day";


@Injectable({
  providedIn: 'root'
})
export class ExerciseDayService {
  private baseUrl = 'http://localhost:8080/api/exerciseDay'
  constructor(private httpClient: HttpClient) { }

  saveExerciseDay(exerciseDay: ExerciseDay): Promise<ExerciseDay> {
    return this.httpClient.post(this.baseUrl, exerciseDay).toPromise().then((resp: ExerciseDay) => resp);
  }


    printExerciseDay(): Promise<ExerciseDay[]> {
    return this.httpClient.get(this.baseUrl).toPromise().then((resp: ExerciseDay[]) => resp);
  }

}
