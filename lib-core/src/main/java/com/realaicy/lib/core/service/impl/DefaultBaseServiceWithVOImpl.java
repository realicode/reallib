package com.realaicy.lib.core.service.impl;

import com.realaicy.lib.core.model.vo.BaseVO;
import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;
import com.realaicy.lib.core.service.BaseServiceWithVO;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

import static com.realaicy.lib.core.utils.RealBeanUtils.getNullPropertyNames;

/**
 * Created by Realaicy on 2015/6/2.
 * XXX
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings({"unused"})
@Transactional
public class DefaultBaseServiceWithVOImpl<M extends BaseEntity<ID> & CommonData<ID>
        , ID extends Serializable, V extends BaseVO<ID>>
        extends DefaultBaseServiceImpl<M, ID>
        implements BaseServiceWithVO<M, ID, V> {


    @Override
    public void saveFromVO(M po, V vo) {

        BeanUtils.copyProperties(vo, po, getNullPropertyNames(vo));
    }
}