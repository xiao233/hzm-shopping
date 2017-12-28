/**
 * Copyright (C), 2015-2017
 * FileName: ProductDetailService
 * Author:   dell
 * Date:     2017/11/9 15:16
 * Description:
 */
package com.iotek.po;

import java.io.Serializable;

/**
 * Created by dell on 2017/11/9.
 */
public class ProductDetail implements Serializable {
    private Long id;
    private  Long productId;
    private String smallImage;
    private String bigImage;
    private  String productCaption;

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

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getProductCaption() {
        return productCaption;
    }

    public void setProductCaption(String productCaption) {
        this.productCaption = productCaption;
    }

    @Override
    public String toString() {
        return "ProductDetailService{" +
                "id=" + id +
                ", productId=" + productId +
                ", smallImage='" + smallImage + '\'' +
                ", bigImage='" + bigImage + '\'' +
                ", productCaption='" + productCaption + '\'' +
                '}';
    }
}
