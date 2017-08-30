package com.awaken.resource.entity.user;

import com.awaken.common.entity.SignEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "a_credential")
public class Credential extends SignEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
