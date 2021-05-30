import { Component, OnInit } from '@angular/core';
import { CanalService } from '../service/canal.service';
import { Canal } from '../modal/canal';
import {MatTableDataSource} from '@angular/material/table';

@Component({
  selector: 'app-canal',
  templateUrl: './canal.component.html',
  styleUrls: ['./canal.component.scss']
})
export class CanalComponent implements OnInit {

  public canals: Canal [] = [];
  displayedColumns = ['id', 'name', 'availability'];
  dataSource = new MatTableDataSource<Canal>();

  constructor(
    public canalService: CanalService)
     { }

  ngOnInit(): void {
      this.getAllCanals();

  }

getAllCanals(){
  this.canalService.getCanals()
      .subscribe(
      response => {
        this.canals = response;
        this.dataSource = new MatTableDataSource(this.canals);
        console.log(this.canals);
      }
    );
}

}
