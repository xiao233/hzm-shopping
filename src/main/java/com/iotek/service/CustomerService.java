package com.iotek.service;

import com.iotek.po.Customer;

import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public interface CustomerService {
    /**
     * 增加用户信息
     * @param customer
     * @return
     */
    boolean addCustomer(Customer customer);
    /**
     * 通过单一条件查询
     * @param customer
     * @return
     */
    List<Customer>  searchCustomer(Customer customer);

    /**
     * 通过多条件查询
     * @param customer
     * @return
     */
    List<Customer> searchCustomers(Customer customer);

    /**
     * 按用户id更新用户信息
     * @param customer

     * @return
     */
    boolean updateCustomer(Customer customer);

    /**
     * 通过id删除用户
     * @param id
     * @return
     */
    boolean deleteCustomer(Long id);

    /**
     * 用户登录
     * @param customer
     * @return
     */
    Customer login(Customer customer);
}
