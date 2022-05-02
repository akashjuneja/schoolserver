import { Student } from './../student';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentServiceService {

  constructor(private http:HttpClient) { }
  baseurl="https://jsonplaceholder.typicode.com/users";
  getList():Observable<Student[]>{
    return this.http.get<Student[]>(`${this.baseurl}`)

  }
}
