import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'interface';
  ask1?: string;
  ask2?: string;
  ask3?: string;
  ask4?: string;
  ask5?: string;

  ngOnInit(): void {
    this.verificaProdutoMaisVendito();
  }

  verificaProduto() {

  }

  verificaQtdTotal() {

  }

  verificaValorTotal() {

  }

  verificaData() {

  }

  verificaTotalLoja() {

  }

  verificaProdutoMaisVendito() {

  }

}
