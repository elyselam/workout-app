import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

import {map} from "rxjs/operators";
import {Exercise} from "../common/exercise";

@Injectable({
  providedIn: 'root'
})
export class ExerciseService {

  private baseUrl = 'http://localhost:8080/api/exercise-details'
  constructor(private httpClient: HttpClient) {
  }
  getExerciseDetails(): Observable<Exercise[]>{
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(map(response => response._embedded.exercise));
  }
}


interface GetResponse {
  _embedded: {
    exercise: Exercise[];
  }
}
