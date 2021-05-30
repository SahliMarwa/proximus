import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Canal } from '../modal/canal';

const endpoint = 'http://localhost:8080/proximus/canal/';


@Injectable({
  providedIn: 'root'
})
export class CanalService {

  constructor(private http: HttpClient) { }

  getCanals(): Observable<Canal[]>{
    return this.http.get<Canal[]>(endpoint + 'all');
  }


}
