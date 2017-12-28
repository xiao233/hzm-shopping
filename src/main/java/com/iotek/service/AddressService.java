package com.iotek.service;

import com.iotek.po.Address;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface AddressService {
    /**
     * 增加地址信息
     * @param address
     * @return
     */
    boolean addAddress(Address address);

    /**
     * 按单一条件查询地址信息
     * @param address
     * @return
     */
    List<Address> searchAddress(Address address);
}
