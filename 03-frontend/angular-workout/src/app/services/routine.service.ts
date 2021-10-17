import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Exercises} from "../common/exercises";
import {map} from "rxjs/operators";
import {Routine} from "../common/routine";

@Injectable({
  providedIn: 'root'
})
export class RoutineService {
  private baseUrl = 'http://localhost:8080/api/routine-details'
  constructor(private httpClient: HttpClient) {
  }
  getExerciseDetails(): Observable<Routine[]>{
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(map(response => response._embedded.exercise));
  }
}


interface GetResponse {
  _embedded: {
    exercise: Routine[];
  }
}
