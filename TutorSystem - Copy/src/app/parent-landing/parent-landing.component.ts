import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { TutorService } from '../service/tutor.service';

export class Tutor {
  constructor (
    public tutorId : number,
    public tutorName : string,
    public tutorCity : string,
    public tutorArea : string,
    public qualification : string, 
    public subject : string,
    public emailId : string,
    public username : string,
    public password : string,
    public mob_no : number,
    public experience : number,
    public timeSlots : number 
  ) {

  }
}

@Component({
  selector: 'app-parent-landing',
  templateUrl: './parent-landing.component.html',
  styleUrls: ['./parent-landing.component.css']
})
export class ParentLandingComponent implements OnInit {

  tutordata : any;

  tutors : Tutor[] = [];
  constructor(private api : TutorService, private httpClient : HttpClient) { 
   
  }


  ngOnInit(): void {
    this.getTutorDetails();
  }

  getTutorDetails() {
    this.api.GetTutors()
    .subscribe(res => {
      console.log(res);
      this.tutors = res;
      
    })
  }
}
