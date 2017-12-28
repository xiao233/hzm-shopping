package com.iotek.service;

import com.iotek.po.OrderItem;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface OrderItemService {
    /**
     * ����С������Ϣ
     * @param orderItem
     * @return
     */
    boolean addOrderItem(OrderItem orderItem);

    /**
     * ����һ������ѯС������Ϣ
     * @param orderItem
     * @return
     */
    List<OrderItem> searchOrderItem(OrderItem orderItem);
}
