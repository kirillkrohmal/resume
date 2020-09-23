package com.devstudy.resume.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    public String created;

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

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

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
