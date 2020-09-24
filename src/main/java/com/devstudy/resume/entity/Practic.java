package com.devstudy.resume.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="practic")
public class Practic extends AbstractEntity<Long> implements Serializable, ProfileEntity {

    @Id
    @SequenceGenerator(name = "PRACTIC_ID_GENERATOR", sequenceName = "PRACTIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRACTIC_ID_GENERATOR")
    @Column(unique = true, nullable = false)
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

    @JoinColumn(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
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
        result = prime * result + ((beginDate == null) ? 0 : beginDate.hashCode());
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((demo == null) ? 0 : demo.hashCode());
        result = prime * result + ((getFinishDate() == null) ? 0 : getFinishDate().hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + ((responsibilities == null) ? 0 : responsibilities.hashCode());
        result = prime * result + ((src == null) ? 0 : src.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Practic))
            return false;
        Practic other = (Practic) obj;
        if (beginDate == null) {
            if (other.beginDate != null)
                return false;
        } else if (!beginDate.equals(other.beginDate))
            return false;
        if (company == null) {
            if (other.company != null)
                return false;
        } else if (!company.equals(other.company))
            return false;
        if (demo == null) {
            if (other.demo != null)
                return false;
        } else if (!demo.equals(other.demo))
            return false;
        if (getFinishDate() == null) {
            if (other.getFinishDate() != null)
                return false;
        } else if (!getFinishDate().equals(other.getFinishDate()))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        if (responsibilities == null) {
            if (other.responsibilities != null)
                return false;
        } else if (!responsibilities.equals(other.responsibilities))
            return false;
        if (src == null) {
            if (other.src != null)
                return false;
        } else if (!src.equals(other.src))
            return false;
        return true;
    }
}
