package com.awaken.common.entity;

import javax.persistence.Column;
import javax.persistence.Version;

public abstract class IdEntityWithDSV extends IdEntity {

    /**
     * 标记：已删除
     */
    @Column(name = "delete_fg")
    private Boolean deleteFg = Boolean.FALSE;

    public Boolean getDeleteFg() {
        return deleteFg;
    }

    public void setDeleteFg(Boolean deleteFg) {
        this.deleteFg = deleteFg;
    }

    /**
     * 是否已被删除
     *
     * @return 删除状态
     */
    public boolean hasDeleted() {
        return this.deleteFg.booleanValue();
    }

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
