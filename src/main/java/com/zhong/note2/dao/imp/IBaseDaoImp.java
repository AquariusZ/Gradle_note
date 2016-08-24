package com.zhong.note2.dao.imp;

import com.zhong.note2.dao.IBaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aquarius on 2016/8/16.
 */
@Repository("iBaseDao")
public class IBaseDaoImp implements IBaseDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrenSession(){
        return sessionFactory.openSession();
    }

    public <T> void saveEntity(T entity) {
        getCurrenSession().saveOrUpdate(entity);
    }

    public <T> void deleteEntity(T entity) {
        getCurrenSession().delete(entity);
    }


    public <T> void deleteEntityById(Class<T> entityClass, Serializable id) {
        getCurrenSession().delete(this.getEntityById(entityClass,id));
    }

    public <T> void updateEntity(T entity) {
        getCurrenSession().update(entity);
    }


    public <T> List<T> getAllEntity(String entityName) {
        return (List<T>) getCurrenSession().createQuery("from "+entityName);
    }


    public <T> T getEntityById(Class<T> entityClass, Serializable id) {
        return getCurrenSession().get(entityClass,id);
    }
}
