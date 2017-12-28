/**
 * Copyright (C), 2015-2017
 * FileName: ProductShelfServiceImp
 * Author:   dell
 * Date:     2017/12/24 23:20
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.ProductShelfDao;
import com.iotek.po.ProductShelf;
import com.iotek.service.ProductService;
import com.iotek.service.ProductShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
@Service(value = "productShelfService")
public class ProductShelfServiceImp implements ProductShelfService {
    @Autowired
    private ProductShelfDao productShelfDao;
    /**
     * �����ϼ���Ϣ
     *
     * @param productShelf
     * @return
     */
    @Override
    public boolean addProductShelf(ProductShelf productShelf) {
        checkProductShelf(productShelf);
        return productShelfDao.add(productShelf);
    }

    /**
     * ����һ������ѯ��Ʒ��Ϣ
     *
     * @param productShelf
     * @return
     */
    @Override
    public List<ProductShelf> searchProductShelf(ProductShelf productShelf) {
        checkProductShelf(productShelf);
        return productShelfDao.query(productShelf);
    }
    private void checkProductShelf(ProductShelf productShelf){
        if (productShelf == null) {
            throw new NullPointerException("��Ʒ�ϼ���Ϣ����Ϊ��");
        }
    }
}
