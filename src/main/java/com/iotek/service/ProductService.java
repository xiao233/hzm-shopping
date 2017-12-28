package com.iotek.service;

import com.iotek.po.Product;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface ProductService {
    /**
     * 添加商品信息
     * @param product
     * @return
     */
    boolean addProduct(Product product);

    /**
     * 按单一条件进行查询
     * @param product
     * @return
     */
    List<Product> searchProduct(Product product);

    /**
     * 按多条件进行查询
     * @param product
     * @return
     */
    List<Product> searchProducts(Product product);

    /**
     * 按商品id进行查询
     * @param pid
     * @return
     */
    Product searchProduct(Long pid);

    /**
     * 按商品名称进行模糊查询
     * @param str
     * @return
     */
    List<Product> searchProducts(String str);

    /**
     * 按单一条件进行删除
     * @param product
     * @return
     */
    boolean deleteProduct(Product product);

    /**
     * 按多条件进行删除
     * @param product
     * @return
     */
    boolean deleteProducts(Product product);

    /**
     * 按商品id进行删除
     * @param pid
     * @return
     */
    boolean deleteProduct(Long pid);

    /**
     * 更新商品信息
     * @param pid
     * @return
     */
    boolean updateProduct(Product product);
}
