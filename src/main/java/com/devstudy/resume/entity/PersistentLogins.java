package com.devstudy.resume.entity;


import javax.persistence.*;

@Entity
@Table(name="persistent_logins")
public class PersistentLogins {

    @Column(name = "username", nullable = false)
    public String username;

    @Column(name = "series", nullable = false)
    public String series;

    @Column(name = "token", nullable = false)
    public String token;

    @Column(name = "last_used", nullable = false)
    public String last_used;


}
