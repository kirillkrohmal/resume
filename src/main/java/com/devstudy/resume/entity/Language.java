package com.devstudy.resume.entity;

import javax.persistence.*;


@Entity
@Table(name="language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "level", nullable = false)
    public String level;

    @Column(name = "type", nullable = false)
    public String type;


    @Column(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;
}
