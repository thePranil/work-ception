import { Component, OnInit } from '@angular/core';
import { RestapiService } from '../../restapi.service';

@Component({
  selector: 'table-component',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  constructor(public rest:RestapiService) { }

  ngOnInit() {
    this.getTableData();
  }

  getTableData() {
    this.rest.getAllProjects().subscribe( data => {
      console.log(data);
    },
    error => console.error(console.log(error))
    );

    this.rest.getAllSkills().subscribe( data => {
      console.log(data);
    },
    error => console.error(console.log(error))
    );

  }

}
