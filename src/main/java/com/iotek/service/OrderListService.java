package com.iotek.service;

import com.iotek.po.OrderList;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface OrderListService {
    /**
     * 增加大订单信息
     * @param orderList
     * @return
     */
    boolean addOrderList(OrderList orderList);

    /**
     * 按单一条件查询大订单信息
     * @param orderList
     * @return
     */
    List<OrderList> searchOrderList(OrderList orderList);
}
