package com.realaicy.lib.core.service.impl;

import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;
import com.realaicy.lib.core.orm.plugin.LogicDeletable;
import com.realaicy.lib.core.service.BaseCommonDeletableService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by Realaicy on 2015/6/2.
 * XXX
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings("unused")
@Transactional
public class DefaultBaseCommonDeletableServiceImpl<M extends BaseEntity<ID> & CommonData<ID> & LogicDeletable
        , ID extends Serializable>
        extends DefaultBaseCommonServiceImpl<M, ID>
        implements BaseCommonDeletableService<M, ID> {

    @Override
    public <S extends M> S save(S entity) {
        entity.markDeleted();
        return super.save(entity);
    }
}
