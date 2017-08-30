package com.awaken.resource.entity.resource.detl;

import com.awaken.resource.entity.resource.Resource;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 组件
 */
@Entity
@Table(name = "r_component")
public class Component extends Resource {

    @OneToOne(mappedBy = "component")
    private Service service;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
