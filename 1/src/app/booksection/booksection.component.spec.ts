import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BooksectionComponent } from './booksection.component';

describe('BooksectionComponent', () => {
  let component: BooksectionComponent;
  let fixture: ComponentFixture<BooksectionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BooksectionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BooksectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
