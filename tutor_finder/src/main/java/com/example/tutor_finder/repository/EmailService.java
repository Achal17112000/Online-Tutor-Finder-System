package com.example.tutor_finder.repository;

import com.example.tutor_finder.bean.EmailDetails;

public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);
}
