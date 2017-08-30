package com.awaken.resource.entity.user;

import com.awaken.common.entity.SignEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "a_user")
public class User extends SignEntity {

    @OneToOne(optional = false, mappedBy = "user")
    private Profile profile;

    @OneToMany(mappedBy = "user")
    private Set<Credential> credentials;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Set<Credential> getCredentials() {
        return credentials;
    }

    public void setCredentials(Set<Credential> credentials) {
        this.credentials = credentials;
    }
}
