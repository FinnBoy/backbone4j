package com.awaken.resource.entity.permission.priv;

import com.awaken.resource.constant.ResourceDivision;
import com.awaken.resource.entity.permission.Privilege;
import com.awaken.resource.entity.resource.Application;

import javax.persistence.*;

/**
 * 系统权限
 */
@Entity
@Table(name = "a_app_privilege")
public class ApplicationPrivs extends Privilege {

    /**
     * 系统／应用
     */
    @ManyToOne(optional = false)
    @JoinColumn(name = "app_id", nullable = false)
    private Application application;

    /**
     * 资源类型
     */
    @Column(name = "resource_division", nullable = false)
    private ResourceDivision resourceDivision;

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public ResourceDivision getResourceDivision() {
        return resourceDivision;
    }

    public void setResourceDivision(ResourceDivision resourceDivision) {
        this.resourceDivision = resourceDivision;
    }
}
