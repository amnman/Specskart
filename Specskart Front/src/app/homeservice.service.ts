import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HomeserviceService {

  constructor(private http:HttpClient) { }

  putPwd(data: any,myemail:string){
    return this.http.put(("http://localhost:8080/changepassword/"+myemail),data);
  }
  getlist(){
    return this.http.get("http://localhost:8080/products");
  }
  postlist(data:any,email:String){
    return this.http.post(("http://localhost:8080/cart/"+email),data);
  }
  getCart(email:String){
    return this.http.get("http://localhost:8080/usercart/"+email);
  }
  postbooking(data:any){
    return this.http.post(("http://localhost:8080/booking"),data)
  }
  getBookings(email:String){
  return this.http.get("http://localhost:8080/bookings/"+email);
  }
  delBooking(data:any){
    return this.http.delete("http://localhost:8080/bookings/"+data);
  }
  delcart(data:any){
    return this.http.delete("http://localhost:8080/delete/"+data);
  }
  delAll(email:any){
    return this.http.delete("http://localhost:8080/deleteall/"+email);
  }
}
