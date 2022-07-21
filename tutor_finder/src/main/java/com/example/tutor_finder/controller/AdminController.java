package com.example.tutor_finder.controller;

import com.example.tutor_finder.bean.Admin;
import com.example.tutor_finder.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }

    @GetMapping("/getAdmins")
    List<Admin> getAdmin() {
        return adminService.getAdmins();
    }

    @GetMapping("/getAdminById/{adminId}")
    Admin getAdminById(@PathVariable("adminId") long adminId) {

        return adminService.getAdminById(adminId);
    }

    @GetMapping("/getAdminByName/{adminName}")
    Admin getAdminByName(@PathVariable("adminName") String adminName) {
        return adminService.getAdminByName(adminName);
    }

    @GetMapping("/getAdminByUsername/{username}")
    Admin getAdminByUserName(@PathVariable("username") String username) {
        return adminService.getAdminByUsername(username);
    }

    @PutMapping("/updateAdmin")
    Admin updateAdmin(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }

    @DeleteMapping("/deleteAdmin")
    void deleteAdmin(@RequestBody Admin admin) {
        adminService.deleteAdmin(admin);
    }

    @DeleteMapping("/deleteAdminById/{adminId}")
    void deleteAdminById(@PathVariable("adminId") long adminId){
        adminService.deleteAdminById(adminId);
    }

    @DeleteMapping("/deleteAdminByUsername/{username}")
    void deleteAdminByUsername(@PathVariable("username") String username) {
        adminService.deleteAdminByUsername(username);
    }


}
