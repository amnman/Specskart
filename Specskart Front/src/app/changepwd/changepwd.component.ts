import { Component, OnInit, Input } from '@angular/core';
import {  Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { HomeserviceService } from '../homeservice.service';
declare  var swal:any;
@Component({
  selector: 'app-changepwd',
  templateUrl: './changepwd.component.html',
  styleUrls: ['./changepwd.component.css']
})
export class ChangepwdComponent implements OnInit {
 chngForm:FormGroup;
 submitted: boolean;

  constructor(private fb:FormBuilder,private route:Router,private cp:HomeserviceService) {
   
   }

  ngOnInit() {
    /*if(localStorage.getItem("usermail")==null){
      this.route.navigateByUrl('');
    }*/
  this.chngForm=this.fb.group({
   yemail:['',[Validators.required,Validators.email]],
   oldpassword:['',Validators.required],
   newpassword:['',Validators.required]

  });
 
  
  }
  get g(){return this.chngForm.controls;}
  
  onSubmit(){
    this.submitted=true;
    if (this.chngForm.invalid) {
      return;
  }
  if(this.chngForm.value.yemail==localStorage.getItem("useremail")){
    this.cp.putPwd(this.chngForm.value.newpassword,this.chngForm.value.yemail).subscribe(z=>{
      console.log(this.chngForm.value);
     
    });
  }
  swal({
    title: "Do you want to change your password?",
    text: "Password changed cannot be reverted!",
    type: "warning",
    showConfirmButton: true 
  }).then((willDelete) => {

    if(willDelete.value){
         swal("Password Changed");
    }
  console.log(willDelete)
});
  this.submitted=false;
}

home(){
    this.route.navigate(['home']);
  }
}
