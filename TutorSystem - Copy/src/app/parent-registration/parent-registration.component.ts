import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ParentService } from '../service/parent.service';
import { ParentModel } from './parent-registration.models';

@Component({
  selector: 'app-parent-registration',
  templateUrl: './parent-registration.component.html',
  styleUrls: ['./parent-registration.component.css']
})
export class ParentRegistrationComponent implements OnInit {

  formValue !: FormGroup;
  parentData !: any;
  parentObj : ParentModel = new ParentModel();

  constructor(private api : ParentService, private formBuilder : FormBuilder) { }

  ngOnInit(): void {
    this.formValue = this.formBuilder.group({
      parentName : [''],
      email : [''],
      mobile : [''],
      area : [''],
      city : [''],
      pincode : [''],
      studentname : [''],
      class : [''],
      subject : [''],
      username : [''],
      password : ['']
    })
  }

  PostParentDetails() {
    this.parentObj.name = this.formValue.value.parentName;
    this.parentObj.emailId = this.formValue.value.email;
    this.parentObj.mob_no = this.formValue.value.mobile;
    this.parentObj.area = this.formValue.value.area;
    this.parentObj.city = this.formValue.value.city;
    this.parentObj.pincode = this.formValue.value.pincode;
    this.parentObj.childName = this.formValue.value.studentname;
    this.parentObj.standard = this.formValue.value.class;
    this.parentObj.username = this.formValue.value.username;
    this.parentObj.password = this.formValue.value.password;
    this.parentObj.subject = this.formValue.value.subject;

    this.api.PostParent(this.parentObj)
    .subscribe(res => {
      console.log(res);
    })
  }



}
