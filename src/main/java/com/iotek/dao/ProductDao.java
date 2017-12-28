package com.iotek.dao;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface ProductDao extends BaseDao<Product>{
    /**
     * 对商品名进行模糊查询
     * @param str
     * @return
     */
    List<Product> queryLikeStr(String str);
}
