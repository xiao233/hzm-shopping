/**
 * Copyright (C), 2015-2017
 * FileName: OrderListServiceImp
 * Author:   dell
 * Date:     2017/12/24 20:47
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.OrderListDao;
import com.iotek.po.OrderList;
import com.iotek.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
@Service(value = "orderListService")
public class OrderListServiceImp implements OrderListService {
    @Autowired
    private OrderListDao orderListDao;
    /**
     * 增加大订单信息
     *
     * @param orderList
     * @return
     */
    @Override
    public boolean addOrderList(OrderList orderList) {
        checkOrderList(orderList);
        return orderListDao.add(orderList);
    }

    /**
     * 按单一条件查询大订单信息
     *
     * @param orderList
     * @return
     */
    @Override
    public List<OrderList> searchOrderList(OrderList orderList) {
        checkOrderList(orderList);
        return orderListDao.query(orderList);
    }
    private void checkOrderList(OrderList orderList){
        if (orderList == null) {
            throw  new NullPointerException("大订单不能为空");
        }
    }
}
