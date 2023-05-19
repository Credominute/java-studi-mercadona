import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FruitsEtLegumesComponent } from './fruits-et-legumes.component';

describe('FruitsEtLegumesComponent', () => {
  let component: FruitsEtLegumesComponent;
  let fixture: ComponentFixture<FruitsEtLegumesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FruitsEtLegumesComponent]
    });
    fixture = TestBed.createComponent(FruitsEtLegumesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
