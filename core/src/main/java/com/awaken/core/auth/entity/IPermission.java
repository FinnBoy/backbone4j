package com.awaken.core.auth.entity;

import java.io.Serializable;

/**
 * 权限（不可再分）
 * <p>参考实现</p>
 * <p>可参考Oracle的权限设计：分成系统权限与对象权限</p>
 * <p>系统权限的级联授予，在被撤销时，级联方的系统权限不会被收回。</p>
 * <p>对象权限的级联授予，在被撤销时，级联方的对象权限会被收回。</p>
 */
public interface IPermission extends Serializable {
}
