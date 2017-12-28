/**
 * Copyright (C), 2015-2017
 * FileName: ProductServiceImp
 * Author:   dell
 * Date:     2017/12/21 22:10
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.ProductDao;
import com.iotek.dao.ProductDetailDao;
import com.iotek.po.Product;
import com.iotek.po.ProductDetail;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
@Service(value = "productService")
public class ProductServiceImp implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductDetailDao productDetailDao;

    /**
     * 添加商品信息
     *
     * @param product
     * @return
     */
    @Override
    public boolean addProduct(Product product) {
        boolean flag=false;
        productDao.add(product);
        ProductDetail productDetail = product.getProductDetail();
        productDetail.setProductId(product.getId());
        flag=productDetailDao.add(productDetail);
        return flag;
    }

    /**
     * 按单一条件进行查询
     *
     * @param product
     * @return
     */
    @Override
    public List<Product> searchProduct(Product product) {
        return productDao.query(product);
    }

    /**
     * 按多条件进行查询
     *
     * @param product
     * @return
     */
    @Override
    public List<Product> searchProducts(Product product) {
        return productDao.querys(product);
    }

    /**
     * 按商品id进行查询
     *
     * @param pid
     * @return
     */
    @Override
    public Product searchProduct(Long pid) {
        Product product = new Product();
        product.setId(pid);
        List<Product> products = searchProduct(product);
        return products.size()>0?products.get(0):null;
    }

    /**
     * 按商品名称进行模糊查询
     *
     * @param str
     * @return
     */
    @Override
    public List<Product> searchProducts(String str) {
        return productDao.queryLikeStr(str);
    }

    /**
     * 按单一条件进行删除
     *
     * @param product
     * @return
     */
    @Override
    public boolean deleteProduct(Product product) {
        return productDao.delete(product);
    }

    /**
     * 按多条件进行删除
     *
     * @param product
     * @return
     */
    @Override
    public boolean deleteProducts(Product product) {
        return false;
    }

    /**
     * 按商品id进行删除
     *
     * @param pid
     * @return
     */
    @Override
    public boolean deleteProduct(Long pid) {
        return false;
    }

    /**
     * 更新商品信息
     *
     * @param product@return
     */
    @Override
    public boolean updateProduct(Product product) {
        return productDao.update(product);
    }
}
