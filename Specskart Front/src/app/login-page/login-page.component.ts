import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { RegistrationServiceService } from '../registration-service.service';

declare var swal:any;
@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  loginForm: FormGroup;
  registerForm: FormGroup;
  submitted: boolean;
  country:any;
  register:any;
 logval:boolean;
  state: any;
  count:any;
  

  constructor(private router:Router,private formBuilder: FormBuilder,private cs:RegistrationServiceService) { 
    this.loginForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required])
    });
  }
  ngOnInit() {
      this.registerForm = this.formBuilder.group({
          
          name: ['', Validators.required],
          email: ['', [Validators.required, Validators.email]],
          password: ['', Validators.required],
          phnum: ['', Validators.required],
          address: ['', Validators.required],
          country: ['', Validators.required],
          state: ['', Validators.required],
          pin: ['', Validators.required],
          acceptTerms: [false, Validators.requiredTrue]
      });

    this.cs.getCountry().subscribe(w=>{
      this.country=w;
    });
    this.cs.getReg().subscribe(x=>{
      this.register=x;
    });

   
  }

  get f(){ return this.registerForm.controls;}
  
 
  onSubmit() {
    if(this.loginForm.valid) {
      console.log(this.v());
        for(var i=0;i<this.register.length;i++){
          if((this.register[i].email==this.loginForm.value.email) && (this.register[i].password==this.loginForm.value.password)){
           this.count=1;
       
            }
          }
        if(this.count==1){
          localStorage.setItem("useremail",this.loginForm.value.email);
          localStorage.setItem("userpassword",this.loginForm.value.password);
          this.router.navigate(['home']);
        }
          else{
            swal({
              title: "Email Incorrect",
              text: "Please Check the entered Email-id. Register if a new user ",
              type: "warning",
              showConfirmButton: true,
            });
            this.count=0;
          }
           
        
    }
  }
  v() {
    return this.loginForm.value;
  }
  onSubmit1() {
    this.submitted = true;
    if (this.registerForm.invalid) {
        return;
   }
    
    this.cs.postReg(this.registerForm.value).subscribe(t=>{
    console.log(t);
    });
    this.cs.postEmail(this.registerForm.value.email).subscribe(t=>{
console.log(this.registerForm.value.email);
    });
    this.onReset();
    swal({
      title: "Registration done Succesfully",
      text: "Login and Enjoy your Shopping! ",
      type: "success",
      showConfirmButton: true,
    });
   
  }
onReset() {
  this.submitted = false;
  this.registerForm.reset();
  
}
states(){
console.log(this.registerForm.value.country)
let cn=this.registerForm.value.country;
let cid: number;
for(var j=0;j<this.country.length;j++){
  if(this.country[j].cname==cn){
    cid=this.country[j].id;
  }
}
  this.cs.getState(cid).subscribe(q=>{
    this.state=q;
    console.log(this.state)
  });
 

}

}





 

