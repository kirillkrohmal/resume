package com.devstudy.resume.entity;

import com.devstudy.resume.model.LanguageLevel;
import com.devstudy.resume.model.LanguageType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name="language")
public class Language extends AbstractEntity<Long> implements Serializable, ProfileEntity {

    @Id
    @SequenceGenerator(name="LANGUAGE_ID_GENERATOR", sequenceName="LANGUAGE_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LANGUAGE_ID_GENERATOR")
    @Column(unique=true, nullable=false)
    public Long id;

    @Column(nullable = false)
    @Convert(converter = LanguageLevel.PersistJPAConverter.class)
    public LanguageLevel languageLevel;

    @Column(nullable = false)
    @Convert(converter = LanguageLevel.PersistJPAConverter.class)
    public LanguageType languageType;

    @Column(name = "name", nullable = false)
    public String name;

    @Column(name = "level", nullable = false)
    public String level;

    @Column(name = "type", nullable = false)
    public String type;

    @JoinColumn(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((level == null) ? 0 : level.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Language))
            return false;
        Language other = (Language) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (level == null) {
            if (other.level != null)
                return false;
        } else if (!level.equals(other.level))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type != other.type)
            return false;
        return true;
    }
}
