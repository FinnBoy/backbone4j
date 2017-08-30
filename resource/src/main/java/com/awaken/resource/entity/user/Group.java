package com.awaken.resource.entity.user;

import com.awaken.common.entity.SignEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "a_group")
public class Group extends SignEntity {

    @ManyToMany(mappedBy = "groups")
    private Set<Profile> profiles;

    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }
}
