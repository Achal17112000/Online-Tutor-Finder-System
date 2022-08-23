import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TutorLandingComponent } from './tutor-landing.component';

describe('TutorLandingComponent', () => {
  let component: TutorLandingComponent;
  let fixture: ComponentFixture<TutorLandingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TutorLandingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TutorLandingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
