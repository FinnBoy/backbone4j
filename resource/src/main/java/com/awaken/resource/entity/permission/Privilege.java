package com.awaken.resource.entity.permission;

import com.awaken.common.entity.SignEntity;
import com.awaken.resource.constant.PermissionDivision;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

/**
 * 权限（不可再分）
 * <p>参考实现</p>
 * <p>可参考Oracle的权限设计：分成系统权限与对象权限</p>
 * <p>系统权限的级联授予，在被撤销时，级联方的系统权限不会被收回。</p>
 * <p>对象权限的级联授予，在被撤销时，级联方的对象权限会被收回。</p>
 */
public abstract class Privilege extends SignEntity {

    /**
     * 资源操作类型
     */
    @Column(nullable = false)
    private PermissionDivision division;

    /**
     * 角色
     */
    @ManyToMany(mappedBy = "privileges")
    private Role role;

    public PermissionDivision getDivision() {
        return division;
    }

    public void setDivision(PermissionDivision division) {
        this.division = division;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
