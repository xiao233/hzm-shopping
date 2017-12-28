/**
 * Copyright (C), 2015-2017
 * FileName: OuterStock
 * Author:   dell
 * Date:     2017/11/12 0:16
 * Description:
 */
package po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/12.
 */
public class OuterStock implements Serializable{
    private Long id;
    private Long productId;
    private Integer outerStockNumber;
    private Timestamp outerStockTime;

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

    public Integer getOuterStockNumber() {
        return outerStockNumber;
    }

    public void setOuterStockNumber(Integer outerStockNumber) {
        this.outerStockNumber = outerStockNumber;
    }

    public Timestamp getOuterStockTime() {
        return outerStockTime;
    }

    public void setOuterStockTime(Timestamp outerStockTime) {
        this.outerStockTime = outerStockTime;
    }

    @Override
    public String toString() {
        return "OuterStock{" +
                "id=" + id +
                ", productId=" + productId +
                ", outerStockNumber=" + outerStockNumber +
                ", outerStockTime=" + outerStockTime +
                '}';
    }
}
