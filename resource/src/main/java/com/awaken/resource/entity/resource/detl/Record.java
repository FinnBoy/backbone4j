package com.awaken.resource.entity.resource.detl;

import com.awaken.resource.entity.resource.Resource;

import javax.persistence.*;

/**
 * 单条数据记录（数据库表）
 */
@Entity
@Table(name = "r_record")
public class Record extends Resource {

    @ManyToOne(optional = false)
    @JoinColumn(name = "table_id")
    private RecordTable table;

    /**
     * 0: means all the data of this table.
     */
    @Column
    private String value;

    public RecordTable getTable() {
        return table;
    }

    public void setTable(RecordTable table) {
        this.table = table;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
