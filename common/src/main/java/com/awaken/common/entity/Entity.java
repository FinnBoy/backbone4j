package com.awaken.common.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Entity implements IEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        return id.equals(entity.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
