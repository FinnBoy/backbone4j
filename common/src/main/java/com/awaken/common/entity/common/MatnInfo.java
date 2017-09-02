package com.awaken.common.entity.common;

import java.util.Date;

public class MatnInfo {

    /**
     * created datetime
     */
    private Date createdDt;

    /**
     * created user's sign
     */
    private String createdBy;

    /**
     * updated datetime
     */
    private Date updatedDt;

    /**
     * updated user's sign
     */
    private String updatedBy;

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
