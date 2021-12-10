import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddExerciseDayComponent } from './add-exercise-day.component';

describe('AddExerciseDayComponent', () => {
  let component: AddExerciseDayComponent;
  let fixture: ComponentFixture<AddExerciseDayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddExerciseDayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddExerciseDayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
