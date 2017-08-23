package com.awaken.resource.entity.user;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "a_organization")
public class Organization {

    @ManyToMany(mappedBy = "organizations")
    private Set<Profile> profiles;

}
