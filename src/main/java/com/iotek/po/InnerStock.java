/**
 * Copyright (C), 2015-2017
 * FileName: InnerStockService
 * Author:   dell
 * Date:     2017/11/10 23:27
 * Description: 入库实体类
 */
package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/10.
 */
public class InnerStock implements Serializable {
    private Long id;
    private Long productId;
    private Integer innerStockNumber;
    private Timestamp innerStockTime;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getInnerStockNumber() {
        return innerStockNumber;
    }

    public void setInnerStockNumber(Integer innerStockNumber) {
        this.innerStockNumber = innerStockNumber;
    }

    public Timestamp getInnerStockTime() {
        return innerStockTime;
    }

    public void setInnerStockTime(Timestamp innerStockTime) {
        this.innerStockTime = innerStockTime;
    }

    @Override
    public String toString() {
        return "InnerStockService{" +
                "id=" + id +
                ", productId=" + productId +
                ", innerStockNumber=" + innerStockNumber +
                ", innerStockTime=" + innerStockTime +
                '}';
    }
}
