package com.realaicy.lib.core.service;

import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;

import java.io.Serializable;

/**
 * <p>抽象service层基类 提供一些简便方法
 * <p/>
 * <p>泛型 ： M 表示实体类型；ID表示主键类型
 * <p/>
 * <p>User: Realaicy
 * <p>Date: 16-1-12 下午8:43
 * <p>Version: 1.0
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings("unused")
public interface BaseCommonService<M extends BaseEntity<ID> & CommonData<ID>, ID extends Serializable>
        extends BaseService<M, ID> {

}
