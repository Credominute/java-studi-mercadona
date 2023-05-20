import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './modules/admin/admin.component';
import { CatalogueComponent } from './modules/catalogue/catalogue.component';
import { FruitsEtLegumesComponent } from './modules/fruits-et-legumes/fruits-et-legumes.component';
import { LaitagesEtEauComponent } from './modules/laitages-et-eau/laitages-et-eau.component';
import { ManuelComponent } from './modules/manuel/manuel.component';
import { ViandesEtPoissonsComponent } from './modules/viandes-et-poissons/viandes-et-poissons.component';


const routes: Routes = [
  { path: 'admin', component: AdminComponent, },
  { path: 'catalogue', component: CatalogueComponent },
  { path: 'fruits-et-legumes', component: FruitsEtLegumesComponent },
  { path: 'laitages-et-eau', component: LaitagesEtEauComponent },
  { path: 'manuel', component: ManuelComponent },
  { path: 'viandes-et-poissons', component: ViandesEtPoissonsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
