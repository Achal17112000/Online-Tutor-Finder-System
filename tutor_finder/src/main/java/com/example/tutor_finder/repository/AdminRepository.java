package com.example.tutor_finder.repository;

import com.example.tutor_finder.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    Admin findByAdminName(String name);

    Admin findByUsername(String username);

    void deleteByUsername(String username);


}
