package com.novice.dao;

import java.io.Serializable;

/**
 * Created by novice on 15/9/24.
 */
public interface BaseHibernateDao {
    /*
     * 保存实例
     */
    <T, PK extends Serializable> PK save(T entity);

    /*
     * 更新实例
     */
    <T> void update(T entity);

    /*
     * 删除实例
     */
    <T> void delete(T entity);

    /*
     * 通过hql语句查找单个实体，如果返回多个报错，没有找到返回null
     *
     * @param hqlStr
     * @return
     */
    <T> T findSingle(final String hqlStr);

}
