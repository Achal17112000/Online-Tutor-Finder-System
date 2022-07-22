package com.example.tutor_finder.controller;

import com.example.tutor_finder.Exception.NotFoundException;
import com.example.tutor_finder.bean.Admin;
import com.example.tutor_finder.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addAdmin")
    ResponseEntity<String> addAdmin(@RequestBody Admin admin){
        try {
            return new ResponseEntity<>("Added Successfully\n" + adminService.addAdmin(admin),HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>("Please enter valid details", HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/getAdmins")
    ResponseEntity<List<Admin>> getAdmin() {
        try {
            if (adminService.getAdmins() == null)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(adminService.getAdmins(), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAdminById/{adminId}")
    ResponseEntity<Admin> getAdminById(@PathVariable("adminId") long adminId) {
        try {
            if (adminService.getAdminById(adminId) == null)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(adminService.getAdminById(adminId), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAdminByName/{adminName}")
    ResponseEntity<Admin> getAdminByName(@PathVariable("adminName") String adminName) {
        try {
            if(adminService.getAdminByName(adminName) == null)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(adminService.getAdminByName(adminName), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAdminByUsername/{username}")
    ResponseEntity<Admin> getAdminByUserName(@PathVariable("username") String username) {
        try {
            if(adminService.getAdminByUsername(username) == null)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            return new ResponseEntity<>(adminService.getAdminByUsername(username), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateAdmin")
    ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
        try {
            if (adminService.updateAdmin(admin) == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(adminService.updateAdmin(admin), HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteAdmin")
    ResponseEntity<HttpStatus> deleteAdmin(@RequestBody Admin admin) {
        try {
            adminService.deleteAdmin(admin);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteAdminById/{adminId}")
    ResponseEntity<HttpStatus> deleteAdminById(@PathVariable("adminId") long adminId){
        try{
            adminService.deleteAdminById(adminId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteAdminByUsername/{username}")
    ResponseEntity<HttpStatus> deleteAdminByUsername(@PathVariable("username") String username) {
        try {
            adminService.deleteAdminByUsername(username);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
