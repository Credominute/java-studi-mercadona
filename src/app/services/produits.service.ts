import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
//import { produits } from '../../config/produit.mock';

@Injectable({
  providedIn: 'root'
})
export class ProduitsService {

  constructor(private HttpClient: HttpClient) { }

  getProduits() : any {

  //this.HttpClient.get(environment.apiUrl)
  // return produits
  }
}
