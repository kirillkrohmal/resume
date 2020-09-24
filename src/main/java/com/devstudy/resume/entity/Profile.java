package com.devstudy.resume.entity;


import org.joda.time.Years;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "profile")
public class Profile extends AbstractEntity<Long> implements Serializable {

    @Id
    @SequenceGenerator(name = "PROFILE_ID_GENERATOR", sequenceName = "PROFILE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFILE_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "uid", nullable = false)
    public String uid;

    @Column(name = "first_name", nullable = false)
    public String firstName;

    @Column(name = "last_name", nullable = false)
    public String lastName;

    @Column(name="birth_day")
    private Date birthday;

    @Column(name = "phone", nullable = false)
    public String phone;

    @Column(name = "email", nullable = false)
    public String email;

    @Column(name = "country", nullable = false)
    public String country;

    @Column(name = "city", nullable = false)
    public String city;

    @Column(name = "objective", nullable = false)
    public String objective;

    @Column(name="summary")
    private Date summary;

    @Column(name = "large_photo", nullable = false)
    public String largePhoto;

    @Column(name = "small_photo", nullable = false)
    public String smallPhoto;

    @Column(name = "info", nullable = false)
    public String info;

    @Column(name = "password", nullable = false)
    public String password;

    @Column(name = "completed", nullable = false)
    public String completed;

    @Column(name = "created", nullable = false)
    public Timestamp created;

    @Embedded
    public Contacts contacts;

    @OneToMany(mappedBy = "profile", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Certificate> certificates;

    @OneToMany(mappedBy = "profile", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Course> course;

    @OneToMany(mappedBy = "profile", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Education> education;

    @OneToMany(mappedBy = "profile", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Hobby> hobby;

    @OneToMany(mappedBy = "profile", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Language> language;

    @OneToMany(mappedBy = "profile", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    public List<Practic> practics;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public Date getSummary() {
        return summary;
    }

    public void setSummary(Date summary) {
        this.summary = summary;
    }

    public String getLargePhoto() {
        return largePhoto;
    }

    public void setLargePhoto(String largePhoto) {
        this.largePhoto = largePhoto;
    }

    public String getSmallPhoto() {
        return smallPhoto;
    }

    public void setSmallPhoto(String smallPhoto) {
        this.smallPhoto = smallPhoto;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Transient
    public String getFullName() {
        return firstName + " " + lastName;
    }


    @Transient
    public String getProfilePhoto(){
        if(largePhoto != null) {
            return largePhoto;
        } else {
            return "/static/img/profile-placeholder.png";
        }
    }

    public String updateProfilePhotos(String largePhoto, String smallPhoto) {
        String oldLargeImage = this.largePhoto;
        setLargePhoto(largePhoto);
        setSmallPhoto(smallPhoto);
        return oldLargeImage;
    }
}
