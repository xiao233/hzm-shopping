/**
 * Copyright (C), 2015-2017
 * FileName: ProductShelf
 * Author:   dell
 * Date:     2017/11/10 23:22
 * Description: 上架信息实体类
 */
package po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/10.
 */
public class ProductShelf implements Serializable {
    public static final Integer UP_SHELF=1;//上架
    public static final Integer DOWN_SHELF=0;
    private Long id;
    private Long productId;
    private Integer isUpShelf;
    private Timestamp operTime;
    private Timestamp shelfCreateTime;

    public ProductShelf() {
    }

    public ProductShelf(Long productId) {
        this.productId = productId;
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

    public Integer getIsUpShelf() {
        return isUpShelf;
    }

    public void setIsUpShelf(Integer isUpShelf) {
        this.isUpShelf = isUpShelf;
    }

    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

    public Timestamp getShelfCreateTime() {
        return shelfCreateTime;
    }

    public void setShelfCreateTime(Timestamp shelfCreateTime) {
        this.shelfCreateTime = shelfCreateTime;
    }

    @Override
    public String toString() {
        return "ProductShelf{" +
                "id=" + id +
                ", productId=" + productId +
                ", isUpShelf=" + isUpShelf +
                ", operTime=" + operTime +
                ", shelfCreateTime=" + shelfCreateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductShelf that = (ProductShelf) o;

        return productId.equals(that.productId);

    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}
