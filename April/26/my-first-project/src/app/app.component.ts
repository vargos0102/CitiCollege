import {AfterViewInit, Component, ViewChild} from '@angular/core';
import { Router, RouterModule } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  title = 'my-first-project';

  constructor(public router: Router){

  }

  navigateHome()
  {
    this.router.navigateByUrl('/home')
  }
  navigateAdd()
  {
    this.router.navigateByUrl('/add')
  }
}
