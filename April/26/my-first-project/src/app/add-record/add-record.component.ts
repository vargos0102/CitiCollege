import { Component, OnInit } from '@angular/core';
import { BlogApiService } from '../service/blog-api.service';
import {FormControl, FormsModule, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-add-record',
  templateUrl: './add-record.component.html',
  styleUrls: ['./add-record.component.css']
})
export class AddRecordComponent implements OnInit {
 public id: string;
  public title: string;
 public content: string;
 public record: any;
 public isEdit: boolean;

 titleFormControl = new FormControl('', [
  Validators.required,
]);

  constructor(public blogApi:BlogApiService, public router: Router,private _snackBar: MatSnackBar) 
  { 
    if(this.router.url=='/edit')
    {
      this.record = this.router.getCurrentNavigation().extras.state;
      this.id = this.record.record.id;
      this.title = this.record.record.title;
      this.content = this.record.record.content;
      this.isEdit = true;      
    }
    
  }

  ngOnInit(): void {
  }

  addBlog(){
    if(this.titleFormControl.valid == false)
      return;

    var blogData = {title : this.title, content: this.content};
    console.log(blogData);

    if(this.isEdit)//
    {
      this.blogApi.updateBlog(blogData, this.id).subscribe(
        (data)=>{          
          //alert('Success');
          this.openSnackBar("Success","OK");
        }
      );
    }
    else
    {//
      this.blogApi.addBlog(blogData).subscribe(
        (data)=>{
          this.title = '';
          this.content = '';
          //alert('Success');
          this.openSnackBar("Success","OK");
        }
      );
    }
  }
  openSnackBar(message: string, action: string) {

    this._snackBar.open(message, action);
  }
}
