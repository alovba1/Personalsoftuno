import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Inventario } from 'src/app/Modelo/Inventario';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8092/inventario';

  get(){
    return this.http.get<Inventario[]>(this.Url);
  }
  create(inventario:Inventario)
  {
    return this.http.post<Inventario>(this.Url,inventario);
  }
  getId(id:number) {
    return this.http.get<Inventario>(this.Url+"/"+id);
  }

  update(inventario:Inventario) {
    return this.http.put<Inventario>(this.Url+"/"+inventario.id,inventario);
  }
}
