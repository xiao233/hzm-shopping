/**
 * Copyright (C), 2015-2017
 * FileName: CustomerComment
 * Author:   dell
 * Date:     2017/11/25 17:47
 * Description: ????????????
 */
package po;

import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/25.
 */
public class CustomerComment {
    private Long id;
    private Long orderItemId;
    private String commentCaption;
    private Integer commentScore;
    private Long productId;
    private Long customerId;
    private Timestamp commentCreateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getCommentCaption() {
        return commentCaption;
    }

    public void setCommentCaption(String commentCaption) {
        this.commentCaption = commentCaption;
    }

    public Integer getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Integer commentScore) {
        this.commentScore = commentScore;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Timestamp getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Timestamp commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    @Override
    public String toString() {
        return "CustomerComment{" +
                "orderItemId=" + orderItemId +
                ", commentCaption='" + commentCaption + '\'' +
                ", commentScore=" + commentScore +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", commentCreateTime=" + commentCreateTime +
                '}';
    }
}
