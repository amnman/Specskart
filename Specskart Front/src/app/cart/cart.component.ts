import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeserviceService } from '../homeservice.service';
declare var swal:any;
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
cart:any;
  total=0;
  buy:any;
  emptycart:boolean;

  constructor(private r:Router,private ce:HomeserviceService) { }

  ngOnInit() {
   /* if(localStorage.getItem("usermail")==null){
      this.r.navigateByUrl('');
    }*/
   
    this.ce.getCart(localStorage.getItem("useremail")).subscribe(w=>{
      this.cart=w;
      console.log(this.cart);
      this.Total(this.cart);
    if(this.cart==null){
      this.emptycart=true;
    }
    }); 
   
    
  }
  Total(c:any) {
    for(var i=0;i<c.length;i++){
      this.total=this.total+c[i].price;
    }
  }
 
 home(){
  this.r.navigate(["home"])
 }
 delcart(c:any){
  this.total=0;
   this.ce.delcart(c.id).subscribe(i=>{
     console.log(i);
     this.ngOnInit();
   });
  
 
 }
 buycart(){
  this.buy=this.cart;
  this.ce.delAll(localStorage.getItem("useremail")).subscribe(o=>{
  console.log(localStorage.getItem("this.cart.total.value"))
  this.ngOnInit();
  });

 
}
myalert(){
  this.total=0;
  swal({
    title: "Booking is Confirmed",
    text: " Your order is placed.",
    type: "success",
    showConfirmButton: true,
  
  })
  .then((willDelete) => {

      if(willDelete.value){
           swal("Booking Confirmed");
      }
    console.log(willDelete)
  });
}



}
