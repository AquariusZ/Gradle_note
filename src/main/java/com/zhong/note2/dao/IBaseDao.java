package com.zhong.note2.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Aquarius on 2016/8/16.
 */
public interface IBaseDao {
    <T> void saveEntity(T entity);
    <T> void deleteEntity(T entity);
    <T> void deleteEntityById(Class<T> entityClass, Serializable id);
    <T> void updateEntity(T entity);
    <T> List<T> getAllEntity(String entityName);
    <T> T getEntityById(Class<T> entityClass, Serializable id);
}
