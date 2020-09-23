package com.devstudy.resume.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "name", nullable = false)
    public String name;


    @Column(name = "school", nullable = false)
    public String school;


    @Column(name = "finish_date", nullable = false)
    public Date date;


    @Column(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;




}
