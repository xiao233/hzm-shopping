/**
 * Copyright (C), 2015-2017
 * FileName: ProductStockMapper
 * Author:   dell
 * Date:     2017/11/10 23:18
 * Description: ø‚¥Ê µÃÂ¿‡
 */
package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/10.
 */
public class ProductStock implements Serializable {
    private  Long id;
    private Long productId;
    private Integer stockNumber;
    private Timestamp stockModifiedTime;
    private Timestamp stockCreateTime;

    public ProductStock() {
    }
    public ProductStock(Long id) {
        this.id=id;
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

    public Integer getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Integer stockNumber) {
        this.stockNumber = stockNumber;
    }

    public Timestamp getStockModifiedTime() {
        return stockModifiedTime;
    }

    public void setStockModifiedTime(Timestamp stockModifiedTime) {
        this.stockModifiedTime = stockModifiedTime;
    }

    public Timestamp getStockCreateTime() {
        return stockCreateTime;
    }

    public void setStockCreateTime(Timestamp stockCreateTime) {
        this.stockCreateTime = stockCreateTime;
    }

    @Override
    public String toString() {
        return "ProductStockMapper{" +
                "id=" + id +
                ", productId=" + productId +
                ", stockNumber=" + stockNumber +
                ", stockModifiedTime=" + stockModifiedTime +
                ", stockCreateTime=" + stockCreateTime +
                '}';
    }

}
