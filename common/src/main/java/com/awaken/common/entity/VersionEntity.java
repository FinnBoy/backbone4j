package com.awaken.common.entity;

public abstract class VersionEntity extends Entity {

    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
