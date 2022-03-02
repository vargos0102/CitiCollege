import {AfterViewInit, Component, ViewChild} from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { of } from 'rxjs';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  items = [{ index: 1 }];
  title = 'my-first-project';

  constructor(public router: Router){
    for (var i = 0; i < 3; i++) {
      setTimeout(function() { alert(i); }, 1000 + i);
    }
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
