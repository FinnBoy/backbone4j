package com.awaken.resource.entity.resource.detl;

import com.awaken.resource.entity.resource.Resource;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 服务
 */
@Entity
@Table(name = "r_service")
public class Service extends Resource {

    @OneToOne
    @JoinColumn(name = "component_id")
    private Component component;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
