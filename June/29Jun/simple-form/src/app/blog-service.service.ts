import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
// import { User } from '../model/user';
import { Observable } from "rxjs";
import { Blog } from "./Blog";

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

  public add(blog: Blog) {
    return this.http.post(this.blogUrl, blog);
  }

  public update(id: number, blog: Blog) {
    return this.http.put<Blog>(this.blogUrl + "/" + id, blog);
  }

  public delete(id: number) {
    return this.http.delete(this.blogUrl + "/" + id);
  }
}
