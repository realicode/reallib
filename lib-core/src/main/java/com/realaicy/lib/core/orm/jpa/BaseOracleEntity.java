package com.realaicy.lib.core.orm.jpa;

import com.realaicy.lib.core.orm.AbstractEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * <p> 抽象实体基类，提供统一的ID，和相关的基本功能方法
 * <p> 如果是如mysql这种自动生成主键的，请参考{@link BaseEntity}
 * <p/>
 * 子类只需要在类头上加 @SequenceGenerator(name="seq", sequenceName="你的sequence名字")
 * <p/>
 * <p>Date: 13-1-12 下午4:05
 * <p>Version: 1.0
 *
 * @param <PK> the type parameter
 */
@MappedSuperclass
public abstract class BaseOracleEntity<PK extends Serializable> extends AbstractEntity<PK> {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private PK id;

    /**
     * {@inheritDoc}
     */
    @Override
    public PK getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setId(PK id) {
        this.id = id;
    }
}
