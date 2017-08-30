package com.awaken.resource.entity.resource;

import com.awaken.resource.constant.ResourceDivision;

/**
 * 资源
 */
public interface IResource {

    IDataSource getDataSource();

    void setDataSource(IDataSource dataSource);

    IApplication getApplication();

    void setApplication(IApplication application);

    ResourceDivision getDivision();

    void setDivision(ResourceDivision division);
}
