package com.realaicy.lib.core.orm.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.realaicy.lib.core.orm.plugin.Treeable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * <p> 抽象实体基类，提供统一的ID，和相关的基本功能方法
 * 如果是oracle请参考{@link BaseOracleEntity}
 * <p>Date: 13-1-12 下午4:05
 * <p>Version: 1.0
 *
 * @param <ID> the type parameter
 */
@MappedSuperclass
public abstract class CommonTreeableEntity<ID extends Serializable>
        extends CommonEntity<ID> implements Treeable<ID>{

    /**
     * 树形结构层级
     */

    @Column(name = "CASCADE_ID")
    private String cascadeID = "";

    /**
     * 资源图标
     */
    @Column(name = "RES_ICON")
    private String resIcon;
    /**
     * 资源图标2
     */

    @Column(name = "RES_ICON_EXT")
    private String resIconExt;
    /**
     * 资源排序权值
     */
    @Column(name = "RES_WEIGHT")
    private Short resWeight;
    /**
     * 是否显示
     */
    @Column(name = "IS_SHOW")
    private Boolean isShow;
    /**
     * 资源是否是叶子节点
     */
    @Column(name = "IS_FOLDER")
    @JsonProperty("folder")
    private Boolean isFolder;
    /**
     * 资源是否自动展开子孙节点
     */
    @Column(name = "IS_AUTO_EXPAND")
    @JsonProperty("expanded")
    private Boolean isAutoExpand;


    public String getResIcon() {
        return resIcon;
    }

    public void setResIcon(String resIcon) {
        this.resIcon = resIcon;
    }

    public String getResIconExt() {
        return resIconExt;
    }

    public void setResIconExt(String resIconExt) {
        this.resIconExt = resIconExt;
    }

    public Short getResWeight() {
        return resWeight;
    }

    public void setResWeight(Short resWeight) {
        this.resWeight = resWeight;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    public Boolean getFolder() {
        return isFolder;
    }

    public void setFolder(Boolean folder) {
        isFolder = folder;
    }

    public Boolean getAutoExpand() {
        return isAutoExpand;
    }

    public void setAutoExpand(Boolean autoExpand) {
        isAutoExpand = autoExpand;
    }

    public String getCascadeID() {
        return cascadeID;
    }

    public void setCascadeID(String cascadeID) {
        this.cascadeID = cascadeID;
    }

}
