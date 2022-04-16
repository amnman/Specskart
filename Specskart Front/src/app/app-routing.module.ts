import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginPageComponent } from './login-page/login-page.component';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { ChangepwdComponent } from './changepwd/changepwd.component';
import { CartComponent } from './cart/cart.component';
import { SpeclistComponent } from './speclist/speclist.component';
import { BooksectionComponent } from './booksection/booksection.component';
import { BookingsComponent } from './bookings/bookings.component';



const routes: Routes = [
  {path:"",component:LoginPageComponent},
  {path:"home",component:HomePageComponent},
  {path:"changepwd",component:ChangepwdComponent},
  {path:"cart",component:CartComponent},
  {path:"specslist",component:SpeclistComponent},
  {path:"booking",component:BookingsComponent},
  {path:"bookingsection",component:BooksectionComponent}
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
