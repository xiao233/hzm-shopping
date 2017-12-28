package com.iotek.service;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface ProductService {
    /**
     * �����Ʒ��Ϣ
     * @param product
     * @return
     */
    boolean addProduct(Product product);

    /**
     * ����һ�������в�ѯ
     * @param product
     * @return
     */
    List<Product> searchProduct(Product product);

    /**
     * �����������в�ѯ
     * @param product
     * @return
     */
    List<Product> searchProducts(Product product);

    /**
     * ����Ʒid���в�ѯ
     * @param pid
     * @return
     */
    Product searchProduct(Long pid);

    /**
     * ����Ʒ���ƽ���ģ����ѯ
     * @param str
     * @return
     */
    List<Product> searchProducts(String str);

    /**
     * ����һ��������ɾ��
     * @param product
     * @return
     */
    boolean deleteProduct(Product product);

    /**
     * ������������ɾ��
     * @param product
     * @return
     */
    boolean deleteProducts(Product product);

    /**
     * ����Ʒid����ɾ��
     * @param pid
     * @return
     */
    boolean deleteProduct(Long pid);

    /**
     * ������Ʒ��Ϣ
     * @param pid
     * @return
     */
    boolean updateProduct(Product product);
}
