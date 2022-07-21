package com.example.tutor_finder.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "parent")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parentId;  //Parent unique id

    //Parent details
    private String name;
    private String city;
    private Long pincode;
    private String area;
    private String childName;
    private String subject;
    private String standard;  // class in which child is studying
    private Long mob_no;
    private String username;
    private String password;
    private String emailId;
    private float rating;       // rating for the tutor
    private String bookTutor;

    // Mapping the column of this table

//    @ManyToMany
////    @JsonIgnore
//    @JoinTable(name = "parent_tutor", joinColumns = @JoinColumn(name = "parent_id", referencedColumnName = "parentId"), inverseJoinColumns = @JoinColumn(name = "tutor_id", referencedColumnName = "tutorId"))
//    private Collection<Tutor> tutors;

}
