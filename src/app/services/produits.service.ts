import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Produit } from '../models/produit.model'

@Injectable({
  providedIn: 'root'
})
export class ProduitsService {

  constructor(private HttpClient: HttpClient) { }

  getProduits() : Observable<Produit[]> {
  return this.HttpClient.get<Produit[]>(environment.apiUrl + '/produits')
  }
}
