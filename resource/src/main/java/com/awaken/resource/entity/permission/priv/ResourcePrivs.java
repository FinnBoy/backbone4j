package com.awaken.resource.entity.permission.priv;

import com.awaken.resource.entity.permission.Privilege;
import com.awaken.resource.entity.resource.Resource;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 对象权限
 */
@Entity
@Table(name = "a_resource_privilege")
public class ResourcePrivs extends Privilege {

    /**
     * 资源
     * <p>
     * 单个服务<br/>
     * 或<br/>
     * 单个组件<br/>
     * 或<br/>
     * 单个文档<br/>
     * 或<br/>
     * 单条记录<br/>
     * </p>
     * <p>
     * 与该表主键有关的外键关联表：多（外键表）对一（主键表）、多对多，<br/>
     * 外键值为该条数据的关联数据可以访问，外键值非该条数据的关联数据无法访问）
     * </p>
     */
    @OneToOne(optional = false)
    @JoinColumn(name = "resource_id", nullable = false)
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
