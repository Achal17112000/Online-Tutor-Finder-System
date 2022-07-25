import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class TutorService {

  public tutorUrl : string = "http://localhost:8080/"

  constructor(private _http : HttpClient) { }

  PostTutor(data:any) {
    return this._http.post<any>(`${this.tutorUrl}addTutor`,data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  DeleteTutor(id : number) {
    return this._http.delete<any>(`${this.tutorUrl}deleteTutorById/` + id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  UpdateTutor(data : any) {
    return this._http.put<any>(`${this.tutorUrl}updateTutor`, data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutors() {
    return this._http.get<any>(`${this.tutorUrl}getTutors`)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutorById(id : number) {
    return this._http.get<any>(`${this.tutorUrl}getTutorById/` + id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutorByName(name : string) {
    return this._http.get<any>(`${this.tutorUrl}getTutorByName/` + name)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutorByUsername(username : string) {
    return this._http.get<any>(`${this.tutorUrl}getTutorByUsername/` + username)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutorByArea(area : string){
    return this._http.get<any>(`${this.tutorUrl}getTutorByArea/` + area)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutorByCity(city : string){
    return this._http.get<any>(`${this.tutorUrl}getTutorByCity/` + city)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetTutorBySubject(subject : string){
    return this._http.get<any>(`${this.tutorUrl}getTutorBySubject/` + subject)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  
}
