/**
 * Copyright (C), 2015-2017
 * FileName: ProductStockServiceImp
 * Author:   dell
 * Date:     2017/12/24 22:18
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.ProductStockDao;
import com.iotek.po.ProductStock;
import com.iotek.service.ProductStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
@Service(value = "productStockService")
public class ProductStockServiceImp implements ProductStockService{
    @Autowired
    private ProductStockDao productStockDao;
    /**
     * 添加商品库存信息
     *
     * @param productStock
     * @return
     */
    @Override
    public boolean addProductStock(ProductStock productStock) {
        checkProductStock(productStock);
        return productStockDao.add(productStock);
    }

    /**
     * 按单一条件查询库存
     *
     * @param productStock
     * @return
     */
    @Override
    public List<ProductStock> searchProductStock(ProductStock productStock) {
        checkProductStock(productStock);
        return productStockDao.query(productStock);
    }

    /**
     * 通过单一条件删除库存信息：商品id或者库存表id
     *
     * @param productStock
     * @return
     */
    @Override
    public boolean deleteProductStock(ProductStock productStock) {
        checkProductStock(productStock);

        return false;
    }

    /**
     * 根据单一条件更新库存信息：商品id或者库存表id
     *
     * @param productStock
     * @return
     */
    @Override
    public boolean updateProductStotck(ProductStock productStock) {
        checkProductStock(productStock);

        return false;
    }
    private void checkProductStock(ProductStock productStock){
        if (productStock == null) {
            throw new NullPointerException("商品库存不能为空");
        }
    }
}
