import { Component, OnInit } from "@angular/core";
import { BlogServiceService } from "../blog-service.service";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"],
})
export class HomeComponent implements OnInit {
  constructor(private blogService: BlogServiceService) {}

  blogs: any;
  displayedColumns: string[] = ["id", "title", "content"];
  dataSource = [];

  ngOnInit() {
    this.blogService.findAll().subscribe((data) => {
      this.blogs = data;
      this.dataSource = this.blogs;

      console.log(this.blogs);
    });
  }
}
