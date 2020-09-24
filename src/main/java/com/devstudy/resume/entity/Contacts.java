package com.devstudy.resume.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;


@Embeddable
public class Contacts {

    @Column(name="skype")
    private Date skype;

    @Column(name = "vkontakte", nullable = false)
    public String vkontakte;

    @Column(name = "facebook", nullable = false)
    public String facebook;

    @Column(name = "linkedin", nullable = false)
    public String linkedin;

    @Column(name = "github", nullable = false)
    public String github;

    @Column(name = "stackoverflow", nullable = false)
    public String stackoverflow;


    public Date getSkype() {
        return skype;
    }

    public void setSkype(Date skype) {
        this.skype = skype;
    }

    public String getVkontakte() {
        return vkontakte;
    }

    public void setVkontakte(String vkontakte) {
        this.vkontakte = vkontakte;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getStackoverflow() {
        return stackoverflow;
    }

    public void setStackoverflow(String stackoverflow) {
        this.stackoverflow = stackoverflow;
    }
}
