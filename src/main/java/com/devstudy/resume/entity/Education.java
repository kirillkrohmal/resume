package com.devstudy.resume.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "summary", nullable = false)
    public String summary;

    @Column(name = "begin_year", nullable = false)
    public Integer beginYear;

    @Column(name = "finish_year", nullable = false)
    public Integer finishYear;

    @Column(name = "university", nullable = false)
    public String university;

    @Column(name = "faculty", nullable = false)
    public String faculty;


    @Column(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

}
