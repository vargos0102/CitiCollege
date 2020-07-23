import { Component, OnInit, ViewChild } from "@angular/core";
import { BlogServiceService } from "../blog-service.service";
import { MatPaginator } from "@angular/material/paginator";
import { MatTableDataSource } from "@angular/material/table";
import { MatSort } from "@angular/material/sort";
import { Router } from "@angular/router";
import { MatSnackBar } from "@angular/material/snack-bar";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"],
})
export class HomeComponent implements OnInit {
  constructor(
    private blogService: BlogServiceService,
    private router: Router,
    private _snackBar: MatSnackBar
  ) {}

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;
  @ViewChild(MatSort, { static: true }) sort: MatSort;

  blogs: any;
  displayedColumns: string[] = ["id", "title", "content", "edit", "actions"];
  dataSource = new MatTableDataSource([]);

  ngOnInit() {
    this.BindTableData();
  }

  BindTableData() {
    this.blogService.findAll().subscribe((data) => {
      this.blogs = data;
      this.dataSource = new MatTableDataSource(this.blogs);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;

      console.log(this.blogs);
    });
  }

  Delete(blog) {
    this.blogService.delete(blog.id).subscribe((data) => {
      this.BindTableData();
      this.openSnackBar("Record Deleted", "Success");
    });
  }

  Edit(blog) {
    this.router.navigate(["/edit-blog"], { state: { data: blog } });
  }

  openSnackBar(message: string, action: string) {
    this._snackBar.open(message, action, {
      duration: 4000,
    });
  }
}
