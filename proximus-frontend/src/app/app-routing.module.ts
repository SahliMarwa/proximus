import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CanalComponent } from './canal/canal.component';

const routes: Routes = [
  { path: '', redirectTo: 'canals', pathMatch: 'full' },
  { path: 'canals', component: CanalComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
