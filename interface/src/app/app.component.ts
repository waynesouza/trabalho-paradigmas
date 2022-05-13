import { Component, OnInit } from '@angular/core';
import { ConsultaService } from "./service/consulta.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'interface';
  ask1?: string;
  resp1: string = '';
  ask2?: string;
  resp2: string = '';
  ask3?: string;
  resp3: string = '';
  ask4?: string;
  resp4: string = '';
  ask5?: string;
  resp5: string = '';
  resp6: string = '';


  constructor(private consultaService: ConsultaService) {
  }

  ngOnInit(): void {
    this.verificaProdutoMaisVendito();
  }

  verificaProduto() {
    let consulta = 'compramos(' + this.ask1 + ').';
    this.consultaService.consultaProlog(consulta).subscribe(res => {
      this.resp1 = res.length > 0 ? 'True' : 'False' ;
    },
    error => {
      this.resp1 = 'Erro ao realizar consulta. ' + error.message()
    });
  }

  verificaQtdTotal() {
    let consulta = 'quantos(' + this.ask2 + ',X).';
    this.consultaService.consultaProlog(consulta).subscribe(res => {
      this.resp2 = res[0];
    },
    error => {
      this.resp2 = 'Erro ao realizar consulta. ' + error.message()
    });
  }

  verificaValorTotal() {
    let consulta = 'valor_total(' + this.ask3 + ',X).';
    this.consultaService.consultaProlog(consulta).subscribe(res => {
      this.resp3 = res[0];
    },
    error => {
      this.resp3 = 'Erro ao realizar consulta. ' + error.message()
    });
  }

  verificaData() {
    let consulta = 'comprado_em(\'' + this.ask4 + '\',X)';
    this.consultaService.consultaProlog(consulta).subscribe(res => {
      this.resp4 = res;
    },
    error => {
      this.resp4 = 'Erro ao realizar consulta. ' + error.message()
    });
  }

  verificaTotalLoja() {
    let consulta = 'compra_na_loja(\'' + this.ask5 + '\',X).';
    this.consultaService.consultaProlog(consulta).subscribe(res => {
        this.resp5 = res;
    },
    error => {
      this.resp5 = 'Erro ao realizar consulta. ' + error.message()
    });
  }

  verificaProdutoMaisVendito() {
    let consulta = 'produto_mais_comprado(X).';
    this.consultaService.consultaProlog(consulta).subscribe(res => {
      this.resp6 = res;
    },
    error => {
      this.resp5 = 'Erro ao realizar consulta. ' + error.message()
    });
  }

}
