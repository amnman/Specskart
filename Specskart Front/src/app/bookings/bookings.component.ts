import { Component, OnInit } from '@angular/core';
import { FormBuilder,  FormGroup, Validators } from '@angular/forms';
import { HomeserviceService } from '../homeservice.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
  styleUrls: ['./bookings.component.css']
})
export class BookingsComponent implements OnInit {

  bookingform:FormGroup;
  submitted=false;
  constructor(private bp:FormBuilder,private book:HomeserviceService,private r:Router) { 
    
  }

  ngOnInit() {
    this.bookingform=this.bp.group({
      name:['',Validators.required],
      date:['',Validators.required],
      eid:['']
    });
  }
  home(){
    this.r.navigate(['home']);
  }
  get g(){
    return this.bookingform.controls;
  }
onSubmit(){
  this.submitted=true;
  if(this.bookingform.invalid){
return;
  }
this.bookingform.value.eid=localStorage.getItem("useremail");
console.log(this.bookingform.value);
  this.book.postbooking(this.bookingform.value).subscribe(t=>{
    console.log(t);
  
  });
}
}
