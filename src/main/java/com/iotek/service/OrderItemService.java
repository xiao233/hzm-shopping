package com.iotek.service;

import com.iotek.po.OrderItem;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface OrderItemService {
    /**
     * 增加小订单信息
     * @param orderItem
     * @return
     */
    boolean addOrderItem(OrderItem orderItem);

    /**
     * 按单一条件查询小订单信息
     * @param orderItem
     * @return
     */
    List<OrderItem> searchOrderItem(OrderItem orderItem);
}
