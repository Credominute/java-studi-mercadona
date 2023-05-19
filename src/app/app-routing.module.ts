import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { FruitsEtLegumesComponent } from './fruits-et-legumes/fruits-et-legumes.component';
import { LaitagesEtEauComponent } from './laitages-et-eau/laitages-et-eau.component';
import { ManuelComponent } from './manuel/manuel.component';
import { ViandesEtPoissonsComponent } from './viandes-et-poissons/viandes-et-poissons.component';

const routes: Routes = [
  { path: 'admin', component: AdminComponent, },
  { path: 'catalogue', component: CatalogueComponent },
  { path: 'fruits_et_legumes', component: FruitsEtLegumesComponent },
  { path: 'laitages_et_eau', component: LaitagesEtEauComponent },
  { path: 'manuel', component: ManuelComponent },
  { path: 'viandes_et_poissons', component: ViandesEtPoissonsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
