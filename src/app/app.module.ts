import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { FruitsEtLegumesComponent } from './fruits-et-legumes/fruits-et-legumes.component';
import { LaitagesEtEauComponent } from './laitages-et-eau/laitages-et-eau.component';
import { ManuelComponent } from './manuel/manuel.component';
import { ViandesEtPoissonsComponent } from './viandes-et-poissons/viandes-et-poissons.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    CatalogueComponent,
    FruitsEtLegumesComponent,
    LaitagesEtEauComponent,
    ManuelComponent,
    ViandesEtPoissonsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
