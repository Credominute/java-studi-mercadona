import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LaitagesEtEauComponent } from './laitages-et-eau.component';

describe('LaitagesEtEauComponent', () => {
  let component: LaitagesEtEauComponent;
  let fixture: ComponentFixture<LaitagesEtEauComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LaitagesEtEauComponent]
    });
    fixture = TestBed.createComponent(LaitagesEtEauComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
