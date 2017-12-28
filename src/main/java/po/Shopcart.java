/**
 * Copyright (C), 2015-2017
 * FileName: Shopcat
 * Author:   dell
 * Date:     2017/11/25 17:51
 * Description: ?????????
 */
package po;

import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/25.
 */
public class Shopcart {
    public static final int IS_TIMEOUT=1;
    public static final int IS_NO_TIMEOUT=0;
    private Long id;
    private Long customerId;
    private Long productId;
    private Integer productNumber;
    private Timestamp shopcartCreateTime;
    private Integer isShopcartTimeout;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Timestamp getShopcartCreateTime() {
        return shopcartCreateTime;
    }

    public void setShopcartCreateTime(Timestamp shopcartCreateTime) {
        this.shopcartCreateTime = shopcartCreateTime;
    }

    public Integer getIsShopcartTimeout() {
        return isShopcartTimeout;
    }

    public void setIsShopcartTimeout(Integer isShopcartTimeout) {
        this.isShopcartTimeout = isShopcartTimeout;
    }

    @Override
    public String toString() {
        return "Shopcart{" +
                "customerId=" + customerId +
                ", productId=" + productId +
                ", productNumber=" + productNumber +
                ", shopcartCreateTime=" + shopcartCreateTime +
                ", isShopcartTimeout=" + isShopcartTimeout +
                '}';
    }
}
