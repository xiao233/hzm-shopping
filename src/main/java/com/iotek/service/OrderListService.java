package com.iotek.service;

import com.iotek.po.OrderList;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface OrderListService {
    /**
     * ���Ӵ󶩵���Ϣ
     * @param orderList
     * @return
     */
    boolean addOrderList(OrderList orderList);

    /**
     * ����һ������ѯ�󶩵���Ϣ
     * @param orderList
     * @return
     */
    List<OrderList> searchOrderList(OrderList orderList);
}
