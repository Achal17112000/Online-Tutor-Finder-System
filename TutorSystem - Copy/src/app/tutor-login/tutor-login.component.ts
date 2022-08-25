import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { TutorService } from '../service/tutor.service';
import { TutorModel } from '../tutor-registration/tutor-registration.models';

@Component({
  selector: 'app-tutor-login',
  templateUrl: './tutor-login.component.html',
  styleUrls: ['./tutor-login.component.css']
})
export class TutorLoginComponent implements OnInit {
  
  public loginForm !: FormGroup;
  public loginObj = new TutorModel();

  constructor(private fb : FormBuilder, private router : Router, private api : TutorService) { }

  ngOnInit(): void {
    this.loginForm = this.fb.group({
      email:["",Validators.compose([Validators.required,Validators.email])],
      password:["",Validators.required]
    });
  }

  login(){ 

    this.loginObj.username = this.loginForm.value.email;
    this.loginObj.password = this.loginForm.value.password;

    this.api.GetTutors().subscribe(res => {
      const tutor = res.find((a:any)=>{
        return a.email === this.loginForm.value.email && a.password === this.loginForm.value.password
      });
      if(tutor){
        alert("Login Success!!");
        this.router.navigate(['/tutor-landing']);
          this.loginForm.reset();
      }
    },err=>{
      alert("Something went wrong!!")
    })
    
  }

}
