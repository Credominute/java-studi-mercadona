import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AdminComponent } from './modules/admin/admin.component';
import { CatalogueComponent } from './modules/catalogue/catalogue.component';
import { FruitsEtLegumesComponent } from './modules/fruits-et-legumes/fruits-et-legumes.component';
import { LaitagesEtEauComponent } from './modules/laitages-et-eau/laitages-et-eau.component';
import { ManuelComponent } from './modules/manuel/manuel.component';
import { ViandesEtPoissonsComponent } from './modules/viandes-et-poissons/viandes-et-poissons.component';
import { AppRoutingModule } from './app-routing.module';
import { EnvironmentComponent } from './environment/environment.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    CatalogueComponent,
    FruitsEtLegumesComponent,
    LaitagesEtEauComponent,
    ManuelComponent,
    ViandesEtPoissonsComponent,
    EnvironmentComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
