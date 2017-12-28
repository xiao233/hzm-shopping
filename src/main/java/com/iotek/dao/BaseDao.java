package com.iotek.dao;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface BaseDao<T> {
    /**
     * 增加信息
     * @param t
     * @return
     */
    boolean add(T t);

    /**
     * 按单一条件删除信息
     * @param t
     * @return
     */
    boolean delete(T t);

    /**
     * 按多条件删除信息
     * @param t
     * @return
     */
    boolean deletes(T t);

    /**
     * 按单一条件查询
     * @param t
     * @return
     */
    List<T> query(T t);

    /**
     * 按多条件查询
     * @param t
     * @return
     */
    List<T> querys(T t);

    /**
     * 按单条件更新
     * @param t
     * @return
     */
    boolean update(T t);
}
