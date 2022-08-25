import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  public AdminForm !: FormGroup;
  
  constructor(private fb : FormBuilder, private router : Router) { }

  ngOnInit(): void {
    this.AdminForm = this.fb.group({
      email:["",Validators.compose([Validators.required,Validators.email])],
      password:["",Validators.required]
    });
  }

  login(){ 

    if(this.AdminForm.value.email == "admin@gmail.com" && this.AdminForm.value.password == "Admin123") {   
    this.router.navigate(['/admin-home']);
          this.AdminForm.reset();  }
  }

}




