package com.iotek.service;

import com.iotek.po.ProductShelf;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface ProductShelfService {
    /**
     * �����ϼ���Ϣ
     * @param productShelf
     * @return
     */
    boolean addProductShelf(ProductShelf productShelf);

    /**
     * ����һ������ѯ��Ʒ��Ϣ
     * @param productShelf
     * @return
     */
    List<ProductShelf> searchProductShelf(ProductShelf productShelf);

}
