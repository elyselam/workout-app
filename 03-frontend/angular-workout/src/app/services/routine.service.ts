import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Routine} from "../common/routine";

@Injectable({
  providedIn: 'root'
})
export class RoutineService {
  private baseUrl = 'http://localhost:8080/api/routine'

  constructor(private httpClient: HttpClient) {
  }

  // getExerciseDetails(): Observable<Routine[]>{
  //   return this.httpClient.get<GetResponse>(this.baseUrl).pipe(map(response => response._embedded.exercise));
  // }

  saveRoutine(routine: Routine): Promise<Routine> {
    return this.httpClient.post(this.baseUrl, routine).toPromise().then((resp: Routine) => {
      return resp;
    });

  }

  printRoutine(): Promise<Routine[]> {
    return this.httpClient.get(this.baseUrl).toPromise().then((resp: Routine[]) => {
      return resp;
    });

  }

  updateRoutine(routine:Routine): Promise<Routine> {
    console.log('updating')
    return this.httpClient.put(this.baseUrl, routine).toPromise().then((resp: Routine) => {
      return resp;}
      )
  }
}

