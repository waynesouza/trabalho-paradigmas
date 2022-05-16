import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ConsultaService {

  URL_API: string = 'http://localhost:4200/api/prolog/';

  constructor(private http: HttpClient) { }

  public preencherBaseConhecimento(caminhoArquivo: string): Observable<any> {
    return this.http.post(`${this.URL_API}`, {'arquivoXlsx': caminhoArquivo});
  }

  public consultaProlog(consulta: string): Observable<any> {
    return this.http.post(`${this.URL_API + 'consultar'}`, {'consulta': consulta});
  }

}
