package com.devstudy.resume.entity;

import javax.persistence.*;

@Entity
@Table(name="profile_restore")
public class ProfileRestore {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @Column(name = "token", nullable = false)
    public String token;
}
