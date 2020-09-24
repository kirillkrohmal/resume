package com.devstudy.resume.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name="hobby")
public class Hobby extends AbstractEntity<Long> implements Serializable, Comparable<Hobby>, ProfileEntity{

    @Id
    @SequenceGenerator(name="HOBBY_ID_GENERATOR", sequenceName="HOBBY_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HOBBY_ID_GENERATOR")
    @Column(unique=true, nullable=false)
    public Long id;

    @Column(name = "name", nullable = false)
    public String name;

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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 0;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Hobby))
            return false;
        Hobby other = (Hobby) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Hobby o) {
        if(o == null || getName() == null) {
            return 1;
        } else{
            return getName().compareTo(o.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("Hobby [name=%s]", name);
    }
}
