import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ConsultaService {

  URL_API: string = 'http://localhost:4200/api/prolog/consultar';

  constructor(private http: HttpClient) { }

  public consultaProlog(consulta: string): Observable<any> {
    return this.http.post(`${this.URL_API}`, {'consulta': consulta});
  }

}
