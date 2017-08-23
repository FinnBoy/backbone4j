package com.awaken.resource.entity.permission;

import com.awaken.resource.constant.PermissionDivision;
import com.awaken.resource.entity.resource.BackendService;
import com.awaken.resource.entity.resource.Document;
import com.awaken.resource.entity.resource.FrontendComponent;
import com.awaken.resource.entity.resource.TablePKValue;

import javax.persistence.Entity;

@Entity
public class Permission {

    private PermissionDivision permissionDivision;

    /**
     * 单个文件（不能设为目录）
     */
    private Document document;

    /**
     * 单条数据
     * <p>
     * 与该表主键有关的外键关联表：多（外键表）对一（主键表）、多对多，<br/>
     * 外键值为该条数据的关联数据可以访问，外键值非该条数据的关联数据无法访问）
     * </p>
     */
    private TablePKValue tablePKValue;

    private BackendService backendService;

    private FrontendComponent frontendComponent;
}
