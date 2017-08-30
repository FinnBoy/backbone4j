package com.awaken.resource.entity.resource.detl;

import com.awaken.common.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 文档-闭包表
 */
@Entity
@Table(name = "r_document_closure")
public class DocumentClosure extends IdEntity {

    @Column
    private String ancestor;

    @Column
    private String descendant;

    @Column
    private Long depth;

    public String getAncestor() {
        return ancestor;
    }

    public void setAncestor(String ancestor) {
        this.ancestor = ancestor;
    }

    public String getDescendant() {
        return descendant;
    }

    public void setDescendant(String descendant) {
        this.descendant = descendant;
    }

    public Long getDepth() {
        return depth;
    }

    public void setDepth(Long depth) {
        this.depth = depth;
    }
}
