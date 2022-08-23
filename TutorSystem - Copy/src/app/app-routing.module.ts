import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminHomePageComponent } from './admin-home-page/admin-home-page.component';
import { EbookComponent } from './ebook/ebook.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { LoginComponentComponent } from './login-component/login-component.component';
import { ParentLandingComponent } from './parent-landing/parent-landing.component';
import { ParentRegistrationComponent } from './parent-registration/parent-registration.component';
import { TutorLandingComponent } from './tutor-landing/tutor-landing.component';
import { TutorLoginComponent } from './tutor-login/tutor-login.component';
import { TutorRegistrationComponent } from './tutor-registration/tutor-registration.component';

const routes: Routes = [
  {
    path : 'parent-landing',
    component : ParentLandingComponent
  },
  {
    path : "",
    component : HomeComponent
  },
  {
    path : "parent-registration",
    component : ParentRegistrationComponent
  },
  {
    path: "parent-login",
    component : LoginComponentComponent
  },
  {
    path: "tutor-registration",
    component : TutorRegistrationComponent
  },
  {
    path : "tutor-login",
    component : TutorLoginComponent
  },
  {
    path : "tutor-landing",
    component : TutorLandingComponent
  },
  {
    path : "ebook",
    component : EbookComponent
  },
  {
    path : "admin-home",
    component : AdminHomePageComponent
  },
  {
    path : "**",
    component : ErrorComponent
  },
  


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
