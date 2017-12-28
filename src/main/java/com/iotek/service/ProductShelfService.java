package com.iotek.service;

import com.iotek.po.ProductShelf;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface ProductShelfService {
    /**
     * 增加上架信息
     * @param productShelf
     * @return
     */
    boolean addProductShelf(ProductShelf productShelf);

    /**
     * 按单一条件查询商品信息
     * @param productShelf
     * @return
     */
    List<ProductShelf> searchProductShelf(ProductShelf productShelf);

}
