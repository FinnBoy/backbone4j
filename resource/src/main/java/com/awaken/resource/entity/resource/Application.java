package com.awaken.resource.entity.resource;

import com.awaken.common.entity.IdEntityWithDSV;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "r_application")
@TableGenerator(
        name = "id_generator"
        , table = "r_sequence"
        , pkColumnName = "gen_name"
        , valueColumnName = "gen_value"
        , pkColumnValue = "R_APPLICATION_PK"
        , allocationSize = 100
)
public class Application extends IdEntityWithDSV implements IApplication {

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}