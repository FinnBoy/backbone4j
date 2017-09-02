package com.awaken.resource.entity.user;

import com.awaken.common.entity.IdEntityWithDSV;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "a_organization")
public class Organization extends IdEntityWithDSV {

    @ManyToMany(mappedBy = "organizations")
    private Set<Profile> profiles;

    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }
}
