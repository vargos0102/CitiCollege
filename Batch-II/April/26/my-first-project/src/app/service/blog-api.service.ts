import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BlogApiService {
  baseUrl = 'http://localhost:8080/';

  constructor(private http: HttpClient) { 
    console.log('service');
  }

  getAllBlogs() {   
    return this.http.get(this.baseUrl+'/blog');
  }


  addBlog(blogData:any ) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'       
      })
    };
    return this.http.post(this.baseUrl+'/blog', blogData, httpOptions);      
  }

  deleteBlog(id:any){
    return this.http.delete(this.baseUrl+'/blog/'+id)
  }

  updateBlog(blogData:any, id:any ) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'       
      })
    };
    return this.http.put(this.baseUrl+'/blog/'+id, blogData, httpOptions);   
    //http://localhost:8080/blog/34   
  }
}
