package com.awaken.core.auth.entity;

import java.io.Serializable;

/**
 * 用户的会话
 * <p>实现参考</p>
 * <p>一个用户能否登录多次。</p>
 * <p>多个会话的同一个用户，会话是否设置主次之分。（类似信用卡的主卡副卡，副卡使用受限）</p>
 * <p>用户以自己的身份与凭证登录，但RunAs其他用户身份。此类会话信息设定。</p>
 */
public interface ISession extends Serializable {
}
