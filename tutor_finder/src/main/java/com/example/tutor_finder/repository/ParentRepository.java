package com.example.tutor_finder.repository;

import com.example.tutor_finder.bean.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {

        Parent findByName(String name);

        Parent findByUsername(String username);

        Parent findByArea(String area);

        Parent findByChildName(String childName);

        void deleteByUsername(String username);
}
