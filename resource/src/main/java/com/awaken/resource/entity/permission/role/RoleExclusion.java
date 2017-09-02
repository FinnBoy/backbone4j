package com.awaken.resource.entity.permission.role;

import com.awaken.common.entity.IdEntity;
import com.awaken.resource.entity.permission.Role;

/**
 * 互斥角色
 */
public class RoleExclusion extends IdEntity {

    private Role one;

    private Role another;

    public Role getOne() {
        return one;
    }

    public void setOne(Role one) {
        this.one = one;
    }

    public Role getAnother() {
        return another;
    }

    public void setAnother(Role another) {
        this.another = another;
    }
}
