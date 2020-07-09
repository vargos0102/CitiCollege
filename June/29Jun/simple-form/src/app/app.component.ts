import { Component } from "@angular/core";
import { FormBuilder } from "@angular/forms"; //

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent {
  title = "My First Form";
  formGroup;

  constructor(private formBuilder: FormBuilder) {
    this.formGroup = this.formBuilder.group({
      name: "",
      email: "",
      terms: false,
    });
  }

  onSubmit(formData) {
    var name = formData["name"];
  }
}
