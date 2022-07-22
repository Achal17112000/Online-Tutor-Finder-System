package com.example.tutor_finder.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="tutor")
public class Tutor {

    //Attributes of tutor table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tutorId;       //creating id

    private String tutorName;
    private String tutorCity;
    private String tutorArea;
    private String qualification;
    private int experience;
    private long mob_no;
    private String subject;
    private float timeSlots;
    private String emailId;
    private String username;    //set same as email id
    private String password;
    private String checkBooking;
    private String checkRating;

    @ManyToMany(mappedBy = "tutorList")
    private List<Parent> parentList = new ArrayList<>();

}