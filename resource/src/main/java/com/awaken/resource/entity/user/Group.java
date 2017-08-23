package com.awaken.resource.entity.user;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "a_group")
public class Group {

    @ManyToMany(mappedBy = "groups")
    private Set<Profile> profiles;

}
