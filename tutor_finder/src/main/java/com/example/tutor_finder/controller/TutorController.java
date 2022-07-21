package com.example.tutor_finder.controller;

import com.example.tutor_finder.bean.Tutor;
import com.example.tutor_finder.services.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TutorController {

    @Autowired
    TutorService tutorService;

    @PostMapping("/addTutor")
    Tutor addTutor(@RequestBody Tutor tutor) {
        return tutorService.addTutor(tutor);
    }
    
    @GetMapping("/getTutors")
    List<Tutor> getTutors() {
        return tutorService.getTutors();
    }

    @GetMapping("/getTutorById/{tutorId}")
    Tutor getTutorById(@PathVariable("tutorId") long tutorId) {
        return tutorService.getTutorById(tutorId);
    }

    @GetMapping("/getTutorByName/{tutorName}")
    Tutor getTutorByName(@PathVariable("tutorName") String name) {
        return tutorService.getTutorByName(name);
    }

    @GetMapping("/getTutorByUsername/{username}")
    Tutor getTutorByUsername(@PathVariable("username") String username) {
        return tutorService.getTutorByUsername(username);
    }

    @GetMapping("/getTutorByCity/{city}")
    Tutor getTutorByCity(@PathVariable("city") String city) {
        return tutorService.getTutorByCity(city);
    }

    @GetMapping("/getTutorByArea/{area}")
    Tutor getTutorByArea(@PathVariable("area") String area) {
        return tutorService.getTutorByArea(area);
    }

    @GetMapping("/getTutorBySubject/{subject}")
    Tutor getTutorBySubject(@PathVariable("subject") String subject){
        return tutorService.getTutorBySubject(subject);
    }

    @PutMapping("/updateTutor")
    Tutor updateTutor(@RequestBody Tutor tutor) {
        return tutorService.updateTutor(tutor);
    }

    @DeleteMapping("/deleteTutor")
    void deleteTutor(@RequestBody Tutor tutor) {
        tutorService.deleteTutor(tutor);
    }

    @DeleteMapping("/deleteTutorById/{tutorId}")
    void deleteTutorById(@PathVariable("tutorId") long tutorId) {
        tutorService.deleteTutorById(tutorId);
    }

    @DeleteMapping("/deleteTutorByUsername/{username}")
    void deleteTutorByUsername(@PathVariable("username") String username) {
        tutorService.deleteTutorByUsername(username);
    }
}
