import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Exercises} from "../common/exercises";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class ExerciseService {

  private baseUrl = 'http://localhost:8080/api/exercise-details'
  constructor(private httpClient: HttpClient) {
  }
  getExerciseDetails(): Observable<Exercises[]>{
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(map(response => response._embedded.exercise));
  }
}


interface GetResponse {
  _embedded: {
    exercise: Exercises[];
  }
}
