import { TestBed } from '@angular/core/testing';

import { ExerciseDayService } from './exercise-day-service';

describe('ExerciseDayServiceService', () => {
  let service: ExerciseDayService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ExerciseDayService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
