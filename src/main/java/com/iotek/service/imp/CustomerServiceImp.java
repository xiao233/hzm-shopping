/**
 * Copyright (C), 2015-2017
 * FileName: CustomerServiceImp
 * Author:   dell
 * Date:     2017/12/21 12:27
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.CustomerDao;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
@Transactional
@Service(value = "customerService")
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    /**
     * 增加商品信息
     *
     * @param customer
     * @return
     */
    @Override
    public boolean addCustomer(Customer customer) {
        return customerDao.add(customer);
    }

    /**
     * 通过单一条件查询
     *
     * @param customer
     * @return
     */
    @Override
    public List<Customer> searchCustomer(Customer customer) {
        return customerDao.query(customer);

    }

    /**
     * 通过多条件查询
     *
     * @param customer
     * @return
     */
    @Override
    public List<Customer>  searchCustomers(Customer customer) {
        return customerDao.querys(customer);
    }

    /**
     * 按用户id更新用户信息
     *
     * @param cid
     * @return
     */

    /**
     * 按用户id或者密码更新用户信息
     *
     * @param customer
     * @return
     */
    @Override
    public boolean updateCustomer(Customer customer) {
        if(customer==null){
            return false;
        }
        return customerDao.update(customer);
    }

    /**
     * 通过id删除用户
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteCustomer(Long id) {
        Customer customer = new Customer();
        customer.setId(id);
        return customerDao.delete(customer);
    }

    /**
     * 用户登录
     *
     * @param customer
     * @return
     */
    @Override
    public Customer login(Customer customer) {
        if (customer == null) {
            return null;
        }
        List<Customer> list=searchCustomers(customer);
        return list.size()>0?list.get(0):null;
    }
}
