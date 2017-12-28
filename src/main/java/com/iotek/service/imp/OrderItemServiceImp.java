/**
 * Copyright (C), 2015-2017
 * FileName: OrderItemServiceImp
 * Author:   dell
 * Date:     2017/12/24 21:07
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.OrderItemDao;
import com.iotek.po.OrderItem;
import com.iotek.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
@Service(value = "orderItemService")
public class OrderItemServiceImp implements OrderItemService{
    @Autowired
    private OrderItemDao orderItemDao;
    /**
     * 增加小订单信息
     *
     * @param orderItem
     * @return
     */
    @Override
    public boolean addOrderItem(OrderItem orderItem) {
        checkOrderList(orderItem);
        return orderItemDao.add(orderItem);
    }

    /**
     * 按单一条件查询小订单信息
     *
     * @param orderItem
     * @return
     */
    @Override
    public List<OrderItem> searchOrderItem(OrderItem orderItem) {
        checkOrderList(orderItem);
        return orderItemDao.query(orderItem);
    }
    private void checkOrderList(OrderItem orderItem){
        if(orderItem==null){
            throw new NullPointerException("小订单不能为空");
        }
    }
}
