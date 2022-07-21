package com.example.tutor_finder.services;

import com.example.tutor_finder.bean.Tutor;
import com.example.tutor_finder.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorService {
    
    @Autowired
    TutorRepository tutorRepository;

    public Tutor addTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public List<Tutor> getTutors() {
        List<Tutor> li = new ArrayList<Tutor>();
        tutorRepository.findAll().forEach(x -> li.add(x));
        return li;
    }

    public Tutor getTutorById(long tutorId) {
        return tutorRepository.findById(tutorId).get();
    }

    public Tutor getTutorByName(String name) {
        return tutorRepository.findByTutorName(name);
    }

    public Tutor getTutorByUsername(String username) {
        return tutorRepository.findByUsername(username);
    }

    public Tutor getTutorByArea(String area) {
        return tutorRepository.findByTutorArea(area);
    }

    public Tutor getTutorByCity(String city) {
        return tutorRepository.findByTutorCity(city);
    }
    public Tutor getTutorBySubject(String subject) {
        return tutorRepository.findBySubject(subject);
    }

    public Tutor updateTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public void deleteTutor(Tutor tutor) {
        tutorRepository.delete(tutor);
    }

    public void deleteTutorById(long tutorId) {
        tutorRepository.deleteById(tutorId);
    }

    public void deleteTutorByUsername(String username) {
        tutorRepository.deleteByUsername(username);
    }
}
