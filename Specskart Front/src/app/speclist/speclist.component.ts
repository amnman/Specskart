import { Component, OnInit } from '@angular/core';
import { HomeserviceService } from '../homeservice.service';
import { Router } from '@angular/router';
declare var swal:any; 
@Component({
  selector: 'app-speclist',
  templateUrl: './speclist.component.html',
  styleUrls: ['./speclist.component.css']
})
export class SpeclistComponent implements OnInit {
products:any;
  constructor(private pl:HomeserviceService,private route:Router) { }

  ngOnInit() {
    /*if(localStorage.getItem("usermail")==null){
      this.route.navigateByUrl('');
    }*/
    this.pl.getlist().subscribe(x=>{
  this.products=x;
    });
  }
  addtocart(p: any){
   this.pl.postlist(p,localStorage.getItem("useremail")).subscribe(y=>{
     console.log(y);
   });
   swal({
    title: "Added to Cart",
    text: " Your item is added to cart.",
    type: "success",
  
  })
  }
  home(){
    this.route.navigate(['home']);
  }

}
