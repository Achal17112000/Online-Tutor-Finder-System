import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EmailService {

  public emailUrl : string = "http://localhost:8080/"

  constructor(private _http : HttpClient) { }

  PostEmail(data : any) {
    return this._http.post<any>(`${this.emailUrl}sendMail`, data)
    .pipe(map((res:any)=>{
      return res;
    }))

  }
}
