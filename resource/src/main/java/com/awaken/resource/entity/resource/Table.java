package com.awaken.resource.entity.resource;

import com.awaken.common.entity.SignEntity;

public class Table extends SignEntity {

    private Application application;

    private String schema;

    private String tableName;

    private String description;

    private String pk;

    private Boolean compsitePK;

    private String compsitePK1;

    private String compsitePK2;

    private String compsitePK3;

    private String compsitePK4;

    private String compsitePK5;

    /**
     * 可用于配置权限
     */
    private Boolean configurable;

}
