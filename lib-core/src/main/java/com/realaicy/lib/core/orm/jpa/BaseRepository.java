package com.realaicy.lib.core.orm.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by Realaicy on 2015/5/14.
 *
 * @param <T>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings("unused")
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

    /**
     * 根据主键删除
     *
     * @param ids xxx
     */
    void delete(ID[] ids);
}