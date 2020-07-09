import { Component, OnInit } from "@angular/core";
import { FormBuilder, Validators } from "@angular/forms";
import { FormGroup, FormControl } from "@angular/forms";
@Component({
  selector: "app-register",
  templateUrl: "./register.component.html",
  styleUrls: ["./register.component.css"],
})
export class RegisterComponent implements OnInit {
  title = "My First Form";

  form: FormGroup = new FormGroup({
    name: new FormControl("", Validators.required),
    email: new FormControl("", [Validators.required, Validators.email]),
  });

  constructor() {}

  get f() {
    return this.form.controls;
  }

  ngOnInit() {}

  register() {
    if (this.form.valid) {
      console.log(this.form.value);
    }
  }
}
