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
     * �����Ʒ�����Ϣ
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
     * ����һ������ѯ���
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
     * ͨ����һ����ɾ�������Ϣ����Ʒid���߿���id
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
     * ���ݵ�һ�������¿����Ϣ����Ʒid���߿���id
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
            throw new NullPointerException("��Ʒ��治��Ϊ��");
        }
    }
}
