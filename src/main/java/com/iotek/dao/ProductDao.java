package com.iotek.dao;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface ProductDao extends BaseDao<Product>{
    /**
     * ����Ʒ������ģ����ѯ
     * @param str
     * @return
     */
    List<Product> queryLikeStr(String str);
}
