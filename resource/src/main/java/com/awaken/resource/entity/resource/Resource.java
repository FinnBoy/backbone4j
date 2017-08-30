package com.awaken.resource.entity.resource;

import com.awaken.common.entity.SignEntity;
import com.awaken.resource.constant.ResourceDivision;

public abstract class Resource extends SignEntity implements IResource {

    private IApplication application;

    private IDataSource dataSource;

    private ResourceDivision division;

    @Override
    public IApplication getApplication() {
        return application;
    }

    @Override
    public void setApplication(IApplication application) {
        this.application = application;
    }

    @Override
    public IDataSource getDataSource() {
        return dataSource;
    }

    @Override
    public void setDataSource(IDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public ResourceDivision getDivision() {
        return division;
    }

    @Override
    public void setDivision(ResourceDivision division) {
        this.division = division;
    }
}
