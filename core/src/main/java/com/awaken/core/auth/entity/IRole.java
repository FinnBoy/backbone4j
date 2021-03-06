package com.awaken.core.auth.entity;

import java.io.Serializable;

/**
 * 角色（权限的集合）
 * <p>实现参考</p>
 * <b>RBAC96模型-RBAC1</b>：<br/>
 * <p>
 * 角色继承与包含。
 * </p>
 * <b>RBAC96模型-RBAC2</b>:<br/>
 * <p>SSD（静态职责分离）</p>
 * <p>
 * 1、业务行为互斥角色。
 * </p>
 * <p>
 * 2、基数约束（用户拥有的角色有限，角色拥有的权限有限）。
 * </p>
 * <p>
 * 3、先决条件约束：用户想得到高级权限角色，必须拥有低级权限角色。
 * </p>
 * <p>DSD（动态职责分离）</p>
 * <p>会话与角色之间的约束：运行时角色互斥，用户无法激活拥有的所有角色。</p>
 */
public interface IRole extends Serializable {
}
