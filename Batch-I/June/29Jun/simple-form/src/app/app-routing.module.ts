import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { RegisterComponent } from "./register/register.component";
import { CreateBlogComponent } from "./create-blog/create-blog.component";

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "create-blog", component: CreateBlogComponent },
  { path: "edit-blog", component: CreateBlogComponent },
  { path: "register", component: RegisterComponent },
  { path: "", component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
