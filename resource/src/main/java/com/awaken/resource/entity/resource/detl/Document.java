package com.awaken.resource.entity.resource.detl;

import com.awaken.resource.entity.resource.Resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 文档管理
 * 一、基础层
 * 1、文档存储
 * 2、文档结构化展现
 * 二、管理层
 * 1、文档权限管控
 * 2、文档在线预览
 * 3、文档在线编辑
 * 4、文档版本管理
 * 5、文档搜索
 * 6、文档安全交互
 * 7、文档在线审批和评论
 */
@Entity
@Table(name = "r_document")
public class Document extends Resource {

    @Column
    private String name;

    @Column
    private Boolean directory;

    @Column
    private String extension;

    @Column
    private String mime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDirectory() {
        return directory;
    }

    public void setDirectory(Boolean directory) {
        this.directory = directory;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }
}
