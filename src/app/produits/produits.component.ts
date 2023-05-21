import { Component } from '@angular/core';
import { ProduitsService} from '../services/produits.service';

@Component({
  selector: 'app-produits',
  templateUrl: './produits.component.html',
  styleUrls: ['./produits.component.css']
})
export class ProduitsComponent implements OnInit {
  produits = []

  constructor(private produitsService: ProduitsService) {}

  ngOnInit() {
    this.produits = this.produitsService.getProduits()
  }
}
