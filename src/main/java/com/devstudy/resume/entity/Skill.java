package com.devstudy.resume.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="skill")
public class Skill extends AbstractEntity<Long> implements Serializable, ProfileEntity {

    @Id
    @SequenceGenerator(name="SKILL_ID_GENERATOR", sequenceName="SKILL_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SKILL_ID_GENERATOR")
    @Column(unique=true, nullable=false)
    public Long id;

    @Column(name = "category", nullable = false)
    public String category;

    @Column(name = "value", nullable = false)
    public String value;

    @JoinColumn(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(id, skill.id) &&
                Objects.equals(category, skill.category) &&
                Objects.equals(value, skill.value) &&
                Objects.equals(profile, skill.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, value, profile);
    }
}
