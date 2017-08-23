package com.awaken.resource.entity.user;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "a_user")
public class User {

    @OneToOne(optional = false, mappedBy = "user")
    private Profile profile;

    @OneToMany(mappedBy = "user")
    private Set<Credential> credentials;

}
