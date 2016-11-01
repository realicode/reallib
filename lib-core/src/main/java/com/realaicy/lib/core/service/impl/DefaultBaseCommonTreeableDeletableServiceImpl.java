package com.realaicy.lib.core.service.impl;

import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;
import com.realaicy.lib.core.orm.plugin.LogicDeletable;
import com.realaicy.lib.core.orm.plugin.Treeable;
import com.realaicy.lib.core.service.BaseCommonTreeableDeletableService;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by Realaicy on 2015/6/2.
 * XXX
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings({"unused"})
public class DefaultBaseCommonTreeableDeletableServiceImpl<M extends BaseEntity<ID> &
        CommonData<ID> & Treeable<ID> & LogicDeletable, ID extends Serializable>
        extends DefaultBaseCommonTreeableServiceImpl<M, ID>
        implements BaseCommonTreeableDeletableService<M, ID> {
    @Override
    public <S extends M> S save(S entity) {
        entity.markDeleted();
        return super.save(entity);
    }
}