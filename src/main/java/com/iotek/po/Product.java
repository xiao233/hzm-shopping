/**
 * Copyright (C), 2015-2017
 * FileName: Product
 * Author:   dell
 * Date:     2017/11/9 15:11
 * Description: 商品信息类
 */
package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/9.
 */
public class Product implements Serializable{
    private  Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productType;
    private Timestamp productCreateTime;
    private ProductDetail productDetail;
    //    one to one   一个商品对应一个货架信息
    private ProductShelf  productShelf;
    //      一个商品对应一个库存信息
    private ProductStock  productStock;

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public ProductShelf getProductShelf() {
        return productShelf;
    }

    public void setProductShelf(ProductShelf productShelf) {
        this.productShelf = productShelf;
    }

    public ProductStock getProductStock() {
        return productStock;
    }

    public void setProductStock(ProductStock productStock) {
        this.productStock = productStock;
    }

    public Product() {
    }

    public Product(Long id) {
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Timestamp getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Timestamp productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    @Override
    public String toString() {
        return "\n\t Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productType='" + productType + '\'' +
                ", productCreateTime=" + productCreateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id.equals(product.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
