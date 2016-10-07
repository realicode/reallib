package com.realaicy.lib.core.orm.jpa;

import org.springframework.data.jpa.repository.query.QueryUtils;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Realaicy on 2015/5/14.
 *
 * @param <T>  the type parameter
 * @param <ID> the type parameter
 */
@SuppressWarnings("unused")
public class SimpleBaseRepository<T, ID extends Serializable>
        extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    /**
     * xxx
     */
    private final EntityManager entityManager;


    /**
     * Instantiates a new Simple base repository.
     *
     * @param domainClass   the domain class
     * @param entityManager the entity manager
     */
// There are two constructors to choose from, either can be used.
    public SimpleBaseRepository(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
// This is the recommended method for accessing inherited class dependencies.
        this.entityManager = entityManager;
    }

    public SimpleBaseRepository(JpaEntityInformation<T, ?> entityInformation,
                                EntityManager entityManager) {
        super(entityInformation, entityManager);

        // Keep the EntityManager around to used from the newly introduced methods.
        this.entityManager = entityManager;
    }


    @Override
    public void delete(ID[] ids) {
        //todo
    }

    public T findOneNonDeleted(ID id) {
        Assert.notNull(id, "The given id must not be null!");
        Class domainType = this.getDomainClass();

        return (T) entityManager.createQuery("select e from " + domainType.getName() + " e where e.id=:id and e.deleteFlag=:deleteFlag").
                setParameter("id", id).setParameter("deleteFlag", false).getSingleResult();

    }

}
