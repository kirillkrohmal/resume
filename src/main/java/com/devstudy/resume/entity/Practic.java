package com.devstudy.resume.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="practic")
public class Practic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "position", nullable = false)
    public String position;

    @Column(name = "company", nullable = false)
    public String company;

    @Column(name = "begin_date", nullable = false)
    public Date beginDate;

    @Column(name = "finish_date", nullable = false)
    public Date finishDate;

    @Column(name = "responsibilities", nullable = false)
    public String responsibilities;

    @Column(name = "demo", nullable = false)
    public String demo;

    @Column(name = "src", nullable = false)
    public String src;

    @Column(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;
}
