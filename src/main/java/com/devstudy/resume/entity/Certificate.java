package com.devstudy.resume.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="certificate")
public class Certificate extends AbstractEntity implements Serializable, ProfileEntity {

    @Id
    @SequenceGenerator(name="CERTIFICATE_ID_GENERATOR", sequenceName="CERTIFICATE_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CERTIFICATE_ID_GENERATOR")
    @Column(unique=true, nullable=false)
    public Long id;

    @Column(name = "large_url", nullable = false)
    public String largeUrl;

    @Column(name = "small_url", nullable = false)
    public String smallUrl;

    @JoinColumn(name = "id_profile", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    public Profile profile;

    @Column(name = "name", nullable = false)
    public String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLargeUrl() {
        return largeUrl;
    }

    public void setLargeUrl(String largeUrl) {
        this.largeUrl = largeUrl;
    }

    public String getSmallUrl() {
        return smallUrl;
    }

    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((largeUrl == null) ? 0 : largeUrl.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((smallUrl == null) ? 0 : smallUrl.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof Certificate))
            return false;
        Certificate other = (Certificate) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (largeUrl == null) {
            if (other.largeUrl != null)
                return false;
        } else if (!largeUrl.equals(other.largeUrl))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (smallUrl == null) {
            if (other.smallUrl != null)
                return false;
        } else if (!smallUrl.equals(other.smallUrl))
            return false;
        return true;
    }
}
