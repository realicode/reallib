package com.realaicy.lib.core.service.impl;

import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;
import com.realaicy.lib.core.service.BaseCommonService;
import com.realaicy.lib.core.service.OperatorInforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Realaicy on 2015/6/2.
 * XXX
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings({"unused"})
public class DefaultBaseCommonServiceImpl<M extends BaseEntity<ID> & CommonData<ID>
        , ID extends Serializable>
        extends DefaultBaseServiceImpl<M, ID>
        implements BaseCommonService<M, ID> {

    @Autowired
    OperatorInforService<ID> operatorInforService;

    @Override
    public <S extends M> S save(S entity) {
        entity.setCreateTime(new Date());
        entity.setCreaterID(operatorInforService.getOperatorID());
        entity.setUpdateTime(entity.getCreateTime());
        entity.setUpdaterID(entity.getCreaterID());
        return super.save(entity);
    }

    @Override
    public void update(M entity) {
        entity.setUpdateTime(new Date());
        entity.setUpdaterID(operatorInforService.getOperatorID());
        super.update(entity);
    }
}