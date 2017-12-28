package com.iotek.service;

import com.iotek.po.ProductStock;

import java.util.List;

/**
 * Created by dell on 2017/12/22.
 */
public interface ProductStockService {
    /**
     * 添加商品库存信息
     * @param productStock
     * @return
     */
    boolean addProductStock(ProductStock productStock);

    /**
     * 按单一条件查询库存
     * @param productStock
     * @return
     */
    List<ProductStock> searchProductStock(ProductStock productStock);

    /**
     * 通过单一条件删除库存信息：商品id或者库存表id
     * @param productStock
     * @return
     */
    boolean deleteProductStock(ProductStock productStock);

    /**
     * 根据单一条件更新库存信息：商品id或者库存表id
     * @param productStock
     * @return
     */
    boolean updateProductStotck(ProductStock productStock);
}
