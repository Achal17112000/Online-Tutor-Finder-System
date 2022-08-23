import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { ParentRegistrationComponent } from './parent-registration/parent-registration.component';
import { TutorRegistrationComponent } from './tutor-registration/tutor-registration.component';
import { EmailComponent } from './email/email.component';
import { ParentLandingComponent } from './parent-landing/parent-landing.component';
import { ErrorComponent } from './error/error.component';
import { TutorLoginComponent } from './tutor-login/tutor-login.component';
import { TutorLandingComponent } from './tutor-landing/tutor-landing.component';
import { HomeComponent } from './home/home.component';
import { AdminHomePageComponent } from './admin-home-page/admin-home-page.component';
import { EbookComponent } from './ebook/ebook.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponentComponent,
    ParentRegistrationComponent,
    TutorRegistrationComponent,
    EmailComponent,
    ParentLandingComponent,
    ErrorComponent,
    TutorLoginComponent,
    TutorLandingComponent,
    HomeComponent,
    AdminHomePageComponent,
    EbookComponent,   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
