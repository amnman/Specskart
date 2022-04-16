import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeserviceService } from '../homeservice.service';

@Component({
  selector: 'app-booksection',
  templateUrl: './booksection.component.html',
  styleUrls: ['./booksection.component.css']
})
export class BooksectionComponent implements OnInit {
bookingSection:any;
  constructor(private r:Router,private booksec:HomeserviceService) { }

  ngOnInit() {
    /*if(localStorage.getItem("usermail")==null){
      this.r.navigateByUrl('');
    }*/
  this.booksec.getBookings(localStorage.getItem("useremail")).subscribe(y=>{
    this.bookingSection=y;
    console.log(y);
  });
  }
  home(){
    this.r.navigate(['home']);
  }

  deleteBooking(b:any){
    this.booksec.delBooking(b).subscribe(u=>{
 console.log(b.id);
 this.ngOnInit();
 console.log(localStorage.getItem("useremail"));
    });
    this.r.navigate(['bookingsection']);
  }


}
