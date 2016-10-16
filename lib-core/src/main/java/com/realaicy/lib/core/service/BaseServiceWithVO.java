package com.realaicy.lib.core.service;

import com.realaicy.lib.core.model.vo.BaseVO;
import com.realaicy.lib.core.orm.jpa.entity.BaseEntity;
import com.realaicy.lib.core.orm.plugin.CommonData;

import java.io.Serializable;

public interface BaseServiceWithVO<M extends BaseEntity<ID> & CommonData<ID>,
        ID extends Serializable, V extends BaseVO>
        extends BaseService<M, ID> {

    void saveFromVO(M po, V vo);

}