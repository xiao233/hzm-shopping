/**
 * Copyright (C), 2015-2017
 * FileName: OrderListServiceImp
 * Author:   dell
 * Date:     2017/11/10 13:29
 * Description: 大订单信息实体类
 */
package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dell on 2017/11/10.
 */
public class OrderList implements Serializable ,Comparable<OrderList>{
    public static final int IS_PAY=1;//已经支付
    public static final int IS_NO_PAY=0;//未支付
    private Long id;
    private Long customerId;
    private BigDecimal totalMoney;
    private Integer isPay;
    private String orderState;
    private Timestamp orderCreateTime;
    private List<OrderItem> orderItems;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

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

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    @Override
    public String toString() {
        return "OrderListServiceImp{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalMoney=" + totalMoney +
                ", isPay=" + isPay +
                ", orderState=" + orderState +
                ", orderCreateTime=" + orderCreateTime +
                '}';
    }


    @Override
    public int compareTo(OrderList o) {
        return o.getOrderCreateTime().compareTo(orderCreateTime);
    }
}
