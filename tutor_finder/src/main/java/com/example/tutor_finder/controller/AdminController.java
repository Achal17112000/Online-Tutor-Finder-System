package com.example.tutor_finder.controller;

import com.example.tutor_finder.Exception.ApiRequestException;
import com.example.tutor_finder.bean.Admin;
import com.example.tutor_finder.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin admin){
        if(admin == null)
            throw new ApiRequestException("Please enter valid details");
        return adminService.addAdmin(admin);
    }

    @GetMapping("/getAdmins")
    List<Admin> getAdmin() {
        if(adminService.getAdmins() == null)
            throw new ApiRequestException("No content available");
        return adminService.getAdmins();
    }

    @GetMapping("/getAdminById/{adminId}")
    Admin getAdminById(@PathVariable("adminId") long adminId) {
        if(adminService.getAdminById(adminId) == null )
            throw new ApiRequestException("User not found with " + adminId + " Id");
            return adminService.getAdminById(adminId);
    }

    @GetMapping("/getAdminByName/{adminName}")
    Admin getAdminByName(@PathVariable("adminName") String adminName) {
        if(adminService.getAdminByName(adminName) == null)
            throw new ApiRequestException("User not found with " + adminName);
        return adminService.getAdminByName(adminName);
    }

    @GetMapping("/getAdminByUsername/{username}")
    Admin getAdminByUserName(@PathVariable("username") String username) {
        if(adminService.getAdminByUsername(username) == null)
            throw new ApiRequestException("User not found with " + username);
        return adminService.getAdminByUsername(username);
    }

    @PutMapping("/updateAdmin")
    Admin updateAdmin(@RequestBody Admin admin) {
        if(admin == null)
            throw new ApiRequestException("User not found");
        return adminService.updateAdmin(admin);
    }

    @DeleteMapping("/deleteAdmin")
    void  deleteAdmin(@RequestBody Admin admin) {
        if(admin == null)
            throw new ApiRequestException("User not found");
        adminService.deleteAdmin(admin);
    }

    @DeleteMapping("/deleteAdminById/{adminId}")
    void deleteAdminById(@PathVariable("adminId") long adminId){
        if(adminService.getAdminById(adminId) == null)
            throw new ApiRequestException("User not found");
        adminService.deleteAdminById(adminId);
    }

    @DeleteMapping("/deleteAdminByUsername/{username}")
    void deleteAdminByUsername(@PathVariable("username") String username) {
        if(adminService.getAdminByUsername(username) == null)
            throw new ApiRequestException("User not found");
        adminService.deleteAdminByUsername(username);
    }


}
