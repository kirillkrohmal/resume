package com.devstudy.resume.entity;


import javax.persistence.*;

@Entity
@Table(name="certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "large_url", nullable = false)
    public String largeUrl;

    @Column(name = "small_url", nullable = false)
    public String smallUrl;

    @Column(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

    @Column(name = "name", nullable = false)
    public String name;



}
