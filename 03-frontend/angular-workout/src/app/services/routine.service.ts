import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Routine} from "../common/routine";
import {Exercise} from "../common/exercise";

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

  deleteRoutine(routine:Routine): Promise<Routine> {
    return this.httpClient.delete(this.baseUrl).toPromise().then((resp: Routine) => {
      return resp;
    })
  }


  nailedIt(exercise: Exercise, routine: Routine): void {

    exercise.set1 = exercise.maxRep;

    if (exercise.set2 < exercise.maxRep) {
      exercise.set2 += 1;

    } else if (exercise.set3 < exercise.maxRep) {
      exercise.set3 += 1;

    } else if (exercise.set4 < exercise.maxRep) {
        exercise.set4 += 1;

    } else if (exercise.set4 === exercise.maxRep) {
      exercise.startingWeight = exercise.startingWeight + exercise.incWeightBy;
      exercise.set1 = exercise.maxRep;
      exercise.set2 = exercise.maxRep - 1;
      exercise.set3 = exercise.maxRep - 2;
      exercise.set4 = exercise.maxRep - 3;
      this.updateRoutine(routine);
    }
  }
}

