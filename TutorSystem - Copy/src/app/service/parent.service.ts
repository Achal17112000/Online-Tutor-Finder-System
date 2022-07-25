import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ParentService {

  public parentUrl : string = "http://localhost:8080/"

  constructor(private _http : HttpClient) { }

  PostParent(data : any) {
    return this._http.post<any>(`${this.parentUrl}addParent`,data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  DeleteParent(id : number) {
    return this._http.delete<any>(`${this.parentUrl}deleteParentById/` + id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  UpdateParent(data : any) {
    return this._http.put<any>(`${this.parentUrl}updateParent/`, data)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetParents() {
    return this._http.get<any>(`${this.parentUrl}getParents`)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetParentById(id : number) {
    return this._http.get<any>(`${this.parentUrl}getParentById/` + id)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetParentByName(name : string) {
    return this._http.get<any>(`${this.parentUrl}getParentByName/` + name)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetParentByUsername(username : string) {
    return this._http.get<any>(`${this.parentUrl}getParentByUsername/` + username)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetParentByArea(area : string){
    return this._http.get<any>(`${this.parentUrl}getParentByArea/` + area)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  GetParentByChildName(childName : string) {
    return this._http.get<any>(`${this.parentUrl}getParentByChildName1/` + childName)
    .pipe(map((res:any)=>{
      return res;
    }))
  }

  
}
