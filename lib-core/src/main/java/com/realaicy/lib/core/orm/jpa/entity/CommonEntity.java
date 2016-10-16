package com.realaicy.lib.core.orm.jpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.realaicy.lib.core.orm.plugin.CommonData;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * <p> 抽象实体基类，提供统一的ID，和相关的基本功能方法
 * 如果是oracle请参考{@link BaseOracleEntity}
 * <p>Date: 13-1-12 下午4:05
 * <p>Version: 1.0
 *
 * @param <ID> the type parameter
 */
@MappedSuperclass
public abstract class CommonEntity<ID extends Serializable> extends BaseEntity<ID>
        implements CommonData<ID> {

    /**
     * 资源创建时间戳
     */
    @Column(name = "CREATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    /**
     * 资源创建者
     */
    @Column(name = "CREATERID")
    private ID createrID;
    /**
     * 资源修改时间戳
     */
    @Column(name = "UPDATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    /**
     * 资源修改者
     */
    @Column(name = "UPDATERID")
    private ID updaterID;
    /**
     * 自定义扩展
     */
    @Column(name = "CUSTOM_CODE")
    private String customCode = "";

    /**
     * 资源状态
     */
    @Column(name = "STATUS")
    private short status;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public ID getCreaterID() {
        return createrID;
    }

    public void setCreaterID(ID createrID) {
        this.createrID = createrID;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public ID getUpdaterID() {
        return updaterID;
    }

    public void setUpdaterID(ID updaterID) {
        this.updaterID = updaterID;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }
}
