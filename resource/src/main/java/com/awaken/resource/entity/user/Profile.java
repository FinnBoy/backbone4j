package com.awaken.resource.entity.user;

import com.awaken.common.entity.IdEntityWithDSV;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "a_profile")
public class Profile extends IdEntityWithDSV {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "a_profile_organization",
            joinColumns = {@JoinColumn(name = "profile_id")},
            inverseJoinColumns = {@JoinColumn(name = "org_id")})
    private Set<Organization> organizations;

    @ManyToMany
    @JoinTable(name = "a_profile_group",
            joinColumns = {@JoinColumn(name = "profile_id")},
            inverseJoinColumns = {@JoinColumn(name = "group_id")})
    private Set<Group> groups;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Set<Organization> organizations) {
        this.organizations = organizations;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }
}
