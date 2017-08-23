package com.awaken.resource.entity.user;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "a_credential")
public class Credential {

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;
}
