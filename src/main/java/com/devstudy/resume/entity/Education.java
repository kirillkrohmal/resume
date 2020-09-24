package com.devstudy.resume.entity;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="education")
public class Education extends AbstractEntity<Long> implements Serializable, ProfileEntity{

    @Id
    @SequenceGenerator(name="EDUCATION_ID_GENERATOR", sequenceName="EDUCATION_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EDUCATION_ID_GENERATOR")
    @Column(unique=true, nullable=false)
    public Long id;

    @Column(name = "summary", nullable = false)
    public String summary;

    @Column(name = "begin_year", nullable = false)
    public Integer beginYear;

    @Column(name = "finish_year", nullable = false)
    public Integer finishYear;

    @Column(name = "university", nullable = false)
    public String university;

    @Column(name = "faculty", nullable = false)
    public String faculty;


    @JoinColumn(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(Integer beginYear) {
        this.beginYear = beginYear;
    }

    public Integer getFinishYear() {
        return finishYear;
    }

    public void setFinishYear(Integer finishYear) {
        this.finishYear = finishYear;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((beginYear == null) ? 0 : beginYear.hashCode());
        result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
        result = prime * result + ((finishYear == null) ? 0 : finishYear.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((summary == null) ? 0 : summary.hashCode());
        result = prime * result + ((university == null) ? 0 : university.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Education))
            return false;
        Education other = (Education) obj;
        if (beginYear == null) {
            if (other.beginYear != null)
                return false;
        } else if (!beginYear.equals(other.beginYear))
            return false;
        if (faculty == null) {
            if (other.faculty != null)
                return false;
        } else if (!faculty.equals(other.faculty))
            return false;
        if (finishYear == null) {
            if (other.finishYear != null)
                return false;
        } else if (!finishYear.equals(other.finishYear))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (summary == null) {
            if (other.summary != null)
                return false;
        } else if (!summary.equals(other.summary))
            return false;
        if (university == null) {
            if (other.university != null)
                return false;
        } else if (!university.equals(other.university))
            return false;
        return true;
    }
}
