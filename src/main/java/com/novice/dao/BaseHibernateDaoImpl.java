package com.novice.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * Created by novice on 15/9/24.
 */
public class BaseHibernateDaoImpl implements BaseHibernateDao {

    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public <T, PK extends Serializable> PK save(T entity) {
        return (PK) getSession().save(entity);
    }

    public <T> void update(T entity) {
        getSession().update(entity);
    }

    public <T> void delete(T entity) {
        getSession().delete(entity);
    }

    public <T> T findSingle(String hqlStr) {
        Query query = getSession().createQuery(hqlStr);
        return (T) query.uniqueResult();
    }
}
