import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViandesEtPoissonsComponent } from './viandes-et-poissons.component';

describe('ViandesEtPoissonsComponent', () => {
  let component: ViandesEtPoissonsComponent;
  let fixture: ComponentFixture<ViandesEtPoissonsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViandesEtPoissonsComponent]
    });
    fixture = TestBed.createComponent(ViandesEtPoissonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
