import {ExerciseDay} from "./exercise-day";

export class Routine {
  routineId: number;
  routineName: string;
  exerciseDayList: ExerciseDay[];

  constructor(routineName: string) {
    this.routineName = routineName;
  }
}


