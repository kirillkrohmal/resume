package com.devstudy.resume.entity;


import javax.persistence.*;

@Entity
@Table(name="skill")
public class Skill {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "category", nullable = false)
    public String category;

    @Column(name = "value", nullable = false)
    public String value;

    @Column(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

}
