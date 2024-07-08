import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarComponent } from './Inventario/listar/listar.component';
import { AddComponent } from './Inventario/add/add.component';
import { EditComponent } from './Inventario/edit/edit.component';
import { LoginComponent } from './Inventario/login/login.component';


const routes: Routes = [
  {path:'login', component: LoginComponent},
  {path:'listar', component:ListarComponent},
  {path:'add', component:AddComponent},
  {path:'edit', component: EditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
