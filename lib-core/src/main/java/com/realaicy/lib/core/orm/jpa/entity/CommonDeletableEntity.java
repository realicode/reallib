package com.realaicy.lib.core.orm.jpa.entity;

import com.realaicy.lib.core.orm.plugin.CommonData;
import com.realaicy.lib.core.orm.plugin.LogicDeletable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by realaicy on 2016/10/9.
 * xx
 */
@MappedSuperclass
public abstract class CommonDeletableEntity<ID extends Serializable> extends CommonEntity<ID>
        implements CommonData<ID>, LogicDeletable {
    /**
     * 逻辑删除标志
     */
    @Column(name = "F_DELETED")
    private Boolean deleteFlag = false;

    @Override
    public void markDeleted() {
        this.setDeleteFlag(true);
    }

    @Override
    public void markUnDeleted() {
        this.setDeleteFlag(false);
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
