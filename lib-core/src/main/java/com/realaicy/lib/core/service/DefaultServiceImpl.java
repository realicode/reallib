package com.realaicy.lib.core.service;

import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.realaicy.lib.core.orm.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by Realaicy on 2015/6/2.
 * XXX
 *
 * @param <M>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings("unused")
@Transactional
public class DefaultServiceImpl<M extends AbstractEntity, ID extends Serializable>
        extends ABBaseServiceImpl<M, ID> {

    @Override
    public <S extends M> S save(S entity) {
        return baseRepository.save(entity);
    }

    @Override
    public <S extends M> List<S> save(Iterable<S> entities) {
        return baseRepository.save(entities);
    }

    @Override
    public M saveAndFlush(M entity) {
        return baseRepository.saveAndFlush(entity);
    }

    @Override
    public void delete(M entity) {
        baseRepository.delete(entity);
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.delete(id);
    }

    @Override
    public void deleteByIds(ID[] ids) {
        //todo
    }

    @Override
    public void deleteInBatch(Collection<M> entities) {
        baseRepository.deleteInBatch(entities);
    }

    @Override
    public void update(M o) {

        //todo
    }

    @Override
    public boolean exists(ID id) {
        //todo
        return false;
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return baseRepository.count();
    }

    @Override
    @Transactional(readOnly = true)
    public long count(Specification<M> spec) {
        return baseRepository.count(spec);
    }

    @Override
    @Transactional(readOnly = true)
    public M findOne(ID id) {
        //return baseRepository.findOne(id);
        return baseRepository.findOneNonDeleted(id);
    }

    @Override
    @Transactional(readOnly = true)
    public M findOne(Specification<M> spec) {
        return baseRepository.findOne(spec);
    }

    @Override
    public M findMyTree(Long tenantID, Long orgID) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<M> findAll(Collection<ID> ids) {
        return baseRepository.findAll(ids);
    }

    @Override
    @Transactional(readOnly = true)
    public List<M> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public List<M> findAll(Pageable pageable) {

        return baseRepository.findAll(pageable).getContent();
    }

    @Override
    @Transactional(readOnly = true)
    public List<M> findAll(Specification<M> spec) {
        return baseRepository.findAll(spec);
    }

    @Override
    @Transactional(readOnly = true)
    public List<M> findAll(Specification<M> spec, Pageable pageable) {
        return baseRepository.findAll(spec, pageable).getContent();
    }

    @Override
    public Page<M> findPage(PageRequest pageRequest, String hql, Object... values) {
        return null;
    }

    @Override
    public Page<M> findPage(PageRequest pageRequest, String hql, Map<String, ?> values) {
        return null;
    }

    @Override
    public Page<M> findPage(PageRequest pageRequest, List<PropertyFilter> filters) {
        return null;
    }

    @Override
    public List<M> find(List<PropertyFilter> filters) {
        return null;
    }


}
