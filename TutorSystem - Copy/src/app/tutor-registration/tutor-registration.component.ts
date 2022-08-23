import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EmailModel } from '../email/email.model';
import { EmailService } from '../service/email.service';
import { TutorService } from '../service/tutor.service';
import { TutorModel } from './tutor-registration.models';

@Component({
  selector: 'app-tutor-registration',
  templateUrl: './tutor-registration.component.html',
  styleUrls: ['./tutor-registration.component.css']
})
export class TutorRegistrationComponent implements OnInit {

  formValue !: FormGroup;
  tutorData !: any;
  tutorObj : TutorModel = new TutorModel();
  emailObj : EmailModel = new EmailModel();

  constructor(private api : TutorService, private formBuilder : FormBuilder, private emailapi : EmailService) { }

  ngOnInit(): void {
    this.formValue = this.formBuilder.group ({
      tutorName  : [''],
      tutor_mob  : [''],
      tutor_email  : [''],
      area  : [''],
      city  : [''],
      qualification  : [''],
      experience  : [''],
      subject  : [''],
      timeslot  : [''],
      username  : [''],
      password  : [''],
    })
  }

  PostTutorDetails() {
    this.tutorObj.tutorName = this.formValue.value.tutorName;
    this.tutorObj.mob_no = this.formValue.value.tutor_mob;
    this.tutorObj.emailId = this.formValue.value.tutor_email;
    this.tutorObj.tutorArea = this.formValue.value.area;
    this.tutorObj.tutorCity = this.formValue.value.city;
    this.tutorObj.qualification = this.formValue.value.qualification;
    this.tutorObj.experience = this.formValue.value.experience;
    this.tutorObj.subject= this.formValue.value.subject;
    this.tutorObj.timeSlots = this.formValue.value.timeslot;
    this.tutorObj.username = this.formValue.value.tutor_email;
    this.tutorObj.password= this.formValue.value.tutorName + this.formValue.value.tutor_mob;

    this.api.PostTutor(this.tutorObj)
    .subscribe(res => {
      console.log(res);
      alert("Details has been submitted")
    })

    this.emailObj.recipient = this.formValue.value.tutor_email;
    this.emailObj.msgBody = "Welcome to TutorFinder System\n Your credentials are\nUsername:" + this.tutorObj.username, +
    "\nPassword:" + this.tutorObj.password;
    this.emailObj.subject = "TutorFinderSystem credentials";
    
    this.emailapi.PostEmail(this.emailObj)
    .subscribe(res => {
      console.log(res);
    },err=>{
      alert("soomething went wrong")
    })
  }  
   
}
