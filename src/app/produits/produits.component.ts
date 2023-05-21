import { Component, OnInit } from '@angular/core';
import { ProduitsService} from '../services/produits.service';
import { Produit } from '../models/produit.model'

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})

export class ProduitsComponent implements OnInit {
  produits : Produit[]
  constructor(private produitsService: ProduitsService) {}

  ngOnInit() {
    this.produitsService.getProduits().subscribe( (data) => {
      this.produits = data
    })
  }
}
