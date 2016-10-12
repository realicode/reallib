package com.realaicy.lib.core.orm.jpa.entity;

import com.realaicy.lib.core.orm.plugin.LogicDeletable;

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
public abstract class CommonTreeableDeletableEntity<ID extends Serializable>
        extends CommonTreeableEntity<ID> implements LogicDeletable {

    @Override
    public void markDeleted() {
        this.setDeleteFlag(true);
    }

    /**
     * 逻辑删除标志
     */
    @Column(name = "F_DELETED")
    private Boolean deleteFlag;

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
