import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { LoginPageComponent } from '../login-page/login-page.component';


@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
 username:any;
  constructor(private r:Router) { 
   
  }

  ngOnInit() {
   
   /* if(localStorage.getItem("usermail")==null){
      console.log(localStorage.getItem("useremail"));
      this.r.navigateByUrl('home');
    }
    else{
      this.r.navigateByUrl('');
    }*/
    this.username=localStorage.getItem("useremail");
    console.log(localStorage.getItem("useremail"));
    console.log(localStorage.getItem("userpassword"));
  }

  chng(){
    this.r.navigate(['changepwd']);
  }
  cart(){
    this.r.navigate(['cart']);
  }
  specs(){
    this.r.navigate(['specslist']);
  }
  booking(){
    this.r.navigate(['booking']);
  }
  bookingsection(){
    this.r.navigate(['bookingsection']);
  }
  logout(){
    localStorage.setItem("useremail",null);
    localStorage.setItem("userpassword",null);
    this.r.navigate(['']);
  }
 
}
