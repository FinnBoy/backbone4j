package com.awaken.common.entity;

import javax.persistence.Column;
import javax.persistence.Version;

public abstract class IdEntityWithSV extends IdEntity {

    /**
     * 唯一标记
     * <p>
     * 不同于id，为了保证分库分表后，数据合并时保持数据主键唯一性。
     * </p>
     */
    @Column(nullable = false)
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 版本号（乐观锁）
     */
    @Version
    @Column
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
