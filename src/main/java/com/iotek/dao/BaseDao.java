package com.iotek.dao;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface BaseDao<T> {
    /**
     * ������Ϣ
     * @param t
     * @return
     */
    boolean add(T t);

    /**
     * ����һ����ɾ����Ϣ
     * @param t
     * @return
     */
    boolean delete(T t);

    /**
     * ��������ɾ����Ϣ
     * @param t
     * @return
     */
    boolean deletes(T t);

    /**
     * ����һ������ѯ
     * @param t
     * @return
     */
    List<T> query(T t);

    /**
     * ����������ѯ
     * @param t
     * @return
     */
    List<T> querys(T t);

    /**
     * ������������
     * @param t
     * @return
     */
    boolean update(T t);
}
