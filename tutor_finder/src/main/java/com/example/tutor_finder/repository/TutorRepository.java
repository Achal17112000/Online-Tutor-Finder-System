package com.example.tutor_finder.repository;

import com.example.tutor_finder.bean.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {

    Tutor findByTutorName(String tutorName);
    Tutor findByTutorArea(String tutorArea);
    Tutor findBySubject(String subject);
    Tutor findByUsername(String username);
    Tutor findByTutorCity(String city);

    void deleteByUsername(String username);
}
