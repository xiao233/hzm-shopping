package com.iotek.service;

import com.iotek.po.ProductStock;

import java.util.List;

/**
 * Created by dell on 2017/12/22.
 */
public interface ProductStockService {
    /**
     * �����Ʒ�����Ϣ
     * @param productStock
     * @return
     */
    boolean addProductStock(ProductStock productStock);

    /**
     * ����һ������ѯ���
     * @param productStock
     * @return
     */
    List<ProductStock> searchProductStock(ProductStock productStock);

    /**
     * ͨ����һ����ɾ�������Ϣ����Ʒid���߿���id
     * @param productStock
     * @return
     */
    boolean deleteProductStock(ProductStock productStock);

    /**
     * ���ݵ�һ�������¿����Ϣ����Ʒid���߿���id
     * @param productStock
     * @return
     */
    boolean updateProductStotck(ProductStock productStock);
}
