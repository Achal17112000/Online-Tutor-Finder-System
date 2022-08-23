import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ErrorComponent } from './error/error.component';
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
    component : LoginComponentComponent
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
    path : "**",
    component : ErrorComponent
  },
  


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
