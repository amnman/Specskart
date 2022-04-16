import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookingComponent } from './booking/booking.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { HomePageComponent } from './home-page/home-page.component';
import { ReactiveFormsModule } from '@angular/forms';
import { BookingsComponent } from './bookings/bookings.component';
import { SpeclistComponent } from './speclist/speclist.component';
import { CartComponent } from './cart/cart.component';
import { BooksectionComponent } from './booksection/booksection.component';
import { ChangepwdComponent } from './changepwd/changepwd.component';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    BookingComponent,
    LoginPageComponent,
    HomePageComponent,
    BookingsComponent,
    SpeclistComponent,
    CartComponent,
    BooksectionComponent,
    ChangepwdComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
