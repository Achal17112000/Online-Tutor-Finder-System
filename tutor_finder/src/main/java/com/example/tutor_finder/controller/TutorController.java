package com.example.tutor_finder.controller;

import com.example.tutor_finder.Exception.ApiRequestException;
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
        if(tutor == null)
            throw new ApiRequestException("Please enter valid details");
        return tutorService.addTutor(tutor);
    }
    
    @GetMapping("/getTutors")
    List<Tutor> getTutors() {
        if(tutorService.getTutors() == null)
            throw new ApiRequestException("No Tutors available");
        return tutorService.getTutors();
    }

    @GetMapping("/getTutorById/{tutorId}")
    Tutor getTutorById(@PathVariable("tutorId") long tutorId) {
        if(tutorService.getTutorById(tutorId) == null)
            throw new ApiRequestException("Tutor not found with id " + tutorId);
        return tutorService.getTutorById(tutorId);
    }

    @GetMapping("/getTutorByName/{tutorName}")
    Tutor getTutorByName(@PathVariable("tutorName") String name) {
        if(tutorService.getTutorByName(name) == null)
            throw new ApiRequestException("Tutor not found with name " + name);
        return tutorService.getTutorByName(name);
    }

    @GetMapping("/getTutorByUsername/{username}")
    Tutor getTutorByUsername(@PathVariable("username") String username) {
        if (tutorService.getTutorByUsername(username) == null)
            throw new ApiRequestException("Tutor not found with username " + username);
        return tutorService.getTutorByUsername(username);
    }

    @GetMapping("/getTutorByCity/{city}")
    Tutor getTutorByCity(@PathVariable("city") String city) {
        if (tutorService.getTutorByCity(city) == null)
            throw new ApiRequestException("Tutor not found with city " + city);
        return tutorService.getTutorByCity(city);
    }

    @GetMapping("/getTutorByArea/{area}")
    Tutor getTutorByArea(@PathVariable("area") String area) {
        if (tutorService.getTutorByArea(area) == null)
            throw new ApiRequestException("Tutor not found with area " + area);
        return tutorService.getTutorByArea(area);
    }

    @GetMapping("/getTutorBySubject/{subject}")
    Tutor getTutorBySubject(@PathVariable("subject") String subject){
        if (tutorService.getTutorBySubject(subject) == null)
            throw new ApiRequestException("Tutor not found with subject " + subject);
        return tutorService.getTutorBySubject(subject);
    }

    @PutMapping("/updateTutor")
    Tutor updateTutor(@RequestBody Tutor tutor) {
        if (tutor == null)
            throw new ApiRequestException("Tutor not found");
        return tutorService.updateTutor(tutor);
    }

    @DeleteMapping("/deleteTutor")
    void deleteTutor(@RequestBody Tutor tutor) {
        if (tutor == null)
            throw new ApiRequestException("Tutor not found");
        tutorService.deleteTutor(tutor);
    }

    @DeleteMapping("/deleteTutorById/{tutorId}")
    void deleteTutorById(@PathVariable("tutorId") long tutorId) {
        if (tutorService.getTutorById(tutorId) == null)
            throw new ApiRequestException("Tutor not found with id " + tutorId);
        tutorService.deleteTutorById(tutorId);
    }

    @DeleteMapping("/deleteTutorByUsername/{username}")
    void deleteTutorByUsername(@PathVariable("username") String username) {
        if (tutorService.getTutorByUsername(username) == null)
                throw new ApiRequestException("Tutor not found with username " + username);
        tutorService.deleteTutorByUsername(username);
    }
}
