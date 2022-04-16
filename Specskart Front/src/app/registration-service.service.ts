import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class RegistrationServiceService {


  constructor(private http:HttpClient) { }

  getCountry(){
    return this.http.get("http://localhost:8080/countries");
  }
  getState(data:number){
    return this.http.get("http://localhost:8080/cstate?cid="+data);
  }
  postReg(reg){
   return this.http.post("http://localhost:8080/registrations",reg);
  }
  getReg(){
    return this.http.get("http://localhost:8080/registrations");
  }
  postEmail(data:any){
    return this.http.post("http://localhost:8080/emails",data);
  }
}
