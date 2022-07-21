package com.example.tutor_finder.services;

import com.example.tutor_finder.bean.Admin;
import com.example.tutor_finder.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Admin addAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> getAdmins() {
        List<Admin> li = new ArrayList<>();
        adminRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public Admin getAdminById(long adminId) {
        return adminRepository.findById(adminId).get();
    }

    public Admin getAdminByName(String name) {

        return adminRepository.findByAdminName(name);
    }

    public Admin getAdminByUsername(String username) {

        return adminRepository.findByUsername(username);
    }

    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Admin admin){
        adminRepository.delete(admin);
    }

    public void deleteAdminById(long id) {
        adminRepository.deleteById(id);
    }

    public void deleteAdminByUsername(String username) {
        adminRepository.deleteByUsername(username);
    }





}