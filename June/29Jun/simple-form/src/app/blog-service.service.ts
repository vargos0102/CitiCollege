import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
// import { User } from '../model/user';
import { Observable } from "rxjs";

@Injectable({
  providedIn: "root",
})
export class BlogServiceService {
  private blogUrl: string;

  constructor(private http: HttpClient) {
    this.blogUrl = "http://localhost:8080/blog";
  }

  public findAll(): Observable<any> {
    return this.http.get(this.blogUrl);
  }

  public add(blog: any) {
    return this.http.post(this.blogUrl, blog);
  }
}
