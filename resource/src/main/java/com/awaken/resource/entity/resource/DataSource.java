package com.awaken.resource.entity.resource;

import com.awaken.common.entity.SignEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "r_data_source")
public class DataSource extends SignEntity implements IDataSource {
}
