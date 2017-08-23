package com.awaken.resource.entity.user;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "a_profile")
public class Profile {

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
}
