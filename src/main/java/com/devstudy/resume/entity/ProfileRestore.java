package com.devstudy.resume.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="profile_restore")
public class ProfileRestore {

    @Id
    @Column(name = "id",unique = true, nullable = false)
    public Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    public Profile profile;


    @Column(name = "token", nullable = false)
    public String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
