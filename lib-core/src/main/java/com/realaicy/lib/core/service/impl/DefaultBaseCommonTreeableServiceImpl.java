package com.realaicy.lib.core.service.impl;

import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;
import com.realaicy.lib.core.orm.plugin.Treeable;
import com.realaicy.lib.core.service.BaseCommonService;
import com.realaicy.lib.core.service.BaseCommonTreeableService;
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
@Transactional
public class DefaultBaseCommonTreeableServiceImpl<M extends BaseEntity<ID> &
        CommonData<ID> & Treeable<ID>, ID extends Serializable>
        extends DefaultBaseCommonServiceImpl<M, ID>
        implements BaseCommonTreeableService<M, ID> {
}