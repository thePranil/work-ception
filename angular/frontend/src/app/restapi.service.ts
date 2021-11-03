import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of, throwError } from 'rxjs';
import { map, catchError, tap, retry } from 'rxjs/operators';

const endpoint = 'http://localhost:8080/database/';

@Injectable({
  providedIn: 'root'
})


export class RestapiService {

  constructor(private http:HttpClient) { }

  getAllProjects(): Observable<any> {
    return this.http.get(endpoint + 'projects').pipe(
      map(res => console.log(JSON.stringify(res))),
      catchError(this.errorHandler)
    );
  }

  getAllSkills(): Observable<any> {
    return this.http.get(endpoint + 'skills').pipe(
      map(res => console.log(JSON.stringify(res))),
      catchError(this.errorHandler)
    );
  }

  errorHandler(err: HttpErrorResponse){
    let errorMessage = '';
    if (err.error instanceof ErrorEvent) {

        errorMessage = `An error occurred: ${err.error.message}`;
    } else {

        errorMessage = `Server returned code: ${err.status}, error message is: ${err.message}`;
    }
    console.error(errorMessage);
    return throwError(errorMessage);
  }
}
