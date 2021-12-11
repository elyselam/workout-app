import {Exercise} from "./exercise";

export class ExerciseDay {
  exerciseDayId: number;
  exerciseDayName: string;
  exerciseList: Exercise[];
  routine: number;

  constructor(exerciseDayName: string, routineId: number) {
    this.exerciseDayName = exerciseDayName;
    this.routine = routineId;
  }


}
