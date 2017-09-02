package com.awaken.resource.entity.resource.detl;

import com.awaken.common.entity.IdEntityWithDSV;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * 数据库表
 */
@Entity
@Table(name = "r_record_table")
public class RecordTable extends IdEntityWithDSV {

    @OneToMany(mappedBy = "table")
    private Set<Record> records;

    @Column
    private String schema;

    @Column(name = "table_name")
    private String name;

    @Column
    private String description;

    @Column
    private String pk;

    @Column(name = "composite_pk_fg")
    private Boolean compositePK;

    @Column(name = "composite_pk1")
    private String compositePK1;

    @Column(name = "composite_pk2")
    private String compositePK2;

    @Column(name = "composite_pk3")
    private String compositePK3;

    @Column(name = "composite_pk4")
    private String compositePK4;

    @Column(name = "composite_pk5")
    private String compositePK5;

    /**
     * 可用于配置权限
     */
    @Column(name = "configurable_fg")
    private Boolean configurable;

    public Set<Record> getRecords() {
        return records;
    }

    public void setRecords(Set<Record> records) {
        this.records = records;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public Boolean getCompositePK() {
        return compositePK;
    }

    public void setCompositePK(Boolean compositePK) {
        this.compositePK = compositePK;
    }

    public String getCompositePK1() {
        return compositePK1;
    }

    public void setCompositePK1(String compositePK1) {
        this.compositePK1 = compositePK1;
    }

    public String getCompositePK2() {
        return compositePK2;
    }

    public void setCompositePK2(String compositePK2) {
        this.compositePK2 = compositePK2;
    }

    public String getCompositePK3() {
        return compositePK3;
    }

    public void setCompositePK3(String compositePK3) {
        this.compositePK3 = compositePK3;
    }

    public String getCompositePK4() {
        return compositePK4;
    }

    public void setCompositePK4(String compositePK4) {
        this.compositePK4 = compositePK4;
    }

    public String getCompositePK5() {
        return compositePK5;
    }

    public void setCompositePK5(String compositePK5) {
        this.compositePK5 = compositePK5;
    }

    public Boolean getConfigurable() {
        return configurable;
    }

    public void setConfigurable(Boolean configurable) {
        this.configurable = configurable;
    }
}
