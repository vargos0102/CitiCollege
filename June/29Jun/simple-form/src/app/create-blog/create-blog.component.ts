import { Component, OnInit } from "@angular/core";
import { FormGroup, FormControl, Validators } from "@angular/forms";
import { BlogServiceService } from "../blog-service.service";
import { Router } from "@angular/router";
import { Blog } from "../Blog";
import { MatSnackBar } from "@angular/material/snack-bar";

@Component({
  selector: "app-create-blog",
  templateUrl: "./create-blog.component.html",
  styleUrls: ["./create-blog.component.css"],
})
export class CreateBlogComponent implements OnInit {
  isEdit: boolean;
  blog: any;
  showProgressBar: boolean;

  constructor(
    private blogService: BlogServiceService,
    private router: Router,
    private _snackBar: MatSnackBar
  ) {
    if (this.router.getCurrentNavigation().extras.state) {
      this.isEdit = true;

      this.blog = {
        id: this.router.getCurrentNavigation().extras.state.data.id,
        title: this.router.getCurrentNavigation().extras.state.data.title,
        content: this.router.getCurrentNavigation().extras.state.data.content,
      };
      console.log(this.blog);

      this.form.setValue({
        title: this.blog.title,
        content: this.blog.content,
      });
    }
  }

  form: FormGroup = new FormGroup({
    title: new FormControl("", Validators.required),
    content: new FormControl("", [Validators.required]),
  });

  get f() {
    return this.form.controls;
  }
  ngOnInit() {}
  submit() {
    if (this.form.valid) {
      this.showProgressBar = true;

      let blog = {
        title: this.form.value.title,
        content: this.form.value.content,
      };

      if (this.isEdit) {
        this.blogService.update(this.blog.id, blog).subscribe((data) => {
          this.showProgressBar = false;
          this.openSnackBar("Record got update", "Success!");
        });
      } else {
        this.blogService.add(blog).subscribe((data) => {
          this.showProgressBar = false;
          this.openSnackBar("Record got created", "Success!");
          this.form.reset();
          this.form.clearValidators();
          this.form.controls.title.clearValidators();
          this.form.controls.title.updateValueAndValidity();
          this.form.controls.content.clearValidators();
          this.form.controls.content.updateValueAndValidity();
        });
      }

      console.log(this.form.value);
    }
  }

  openSnackBar(message: string, action: string) {
    this._snackBar.open(message, action, {
      duration: 4000,
    });
  }
}
