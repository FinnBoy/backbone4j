package com.awaken.common.entity;

import javax.persistence.Column;
import javax.persistence.Version;

public abstract class VersionEntity extends Entity {

    /**
     * 版本号（乐观锁）
     */
    @Version
    @Column(name = "VERSION")
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
