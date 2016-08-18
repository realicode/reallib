package com.realaicy.lib.web;

import com.realaicy.lib.core.orm.AbstractEntity;
import com.realaicy.lib.core.service.BaseService;

import java.io.Serializable;

/**
 * Created by realaicy on 16/8/16.
 * xxx
 */
public abstract class BaseController<M extends AbstractEntity, ID extends Serializable> {

    private final BaseService<M, ID> service;

    public BaseController(BaseService<M, ID> service) {
        this.service = service;
    }

    public BaseService<M, ID> getService() {
        return service;
    }
}
