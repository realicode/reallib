package com.realaicy.lib.core.service;

import com.realaicy.lib.core.orm.AbstractEntity;
import com.realaicy.lib.core.orm.jpa.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by Realaicy on 2015/6/2.
 * XXX
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings("unused")
public abstract class ABBaseServiceImpl<M extends AbstractEntity, ID extends Serializable>
        implements BaseService<M, ID> {


    /**
     * XXX
     */
    protected BaseRepository<M, ID> baseRepository;

    /**
     * Sets base repository.
     *
     * @param baseRepository the base repository
     */
    @Autowired
    public void setBaseRepository(BaseRepository<M, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    /**
     * Getter for property 'baseRepository'.
     *
     * @return Value for property 'baseRepository'.
     */
    public BaseRepository<M, ID> getBaseRepository() {
        return baseRepository;
    }
}