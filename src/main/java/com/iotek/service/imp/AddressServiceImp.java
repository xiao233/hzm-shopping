/**
 * Copyright (C), 2015-2017
 * FileName: AddressServiceImp
 * Author:   dell
 * Date:     2017/12/24 19:04
 * Description:
 */
package com.iotek.service.imp;

import com.iotek.dao.AddressDao;
import com.iotek.po.Address;
import com.iotek.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
@Service(value = "addressService")
public class AddressServiceImp implements AddressService{
    @Autowired
    private AddressDao addressDao;
    /**
     * 增加地址信息
     *
     * @param address
     * @return
     */
    @Override
    public boolean addAddress(Address address) {
        checkAddress(address);
        return addressDao.add(address);
    }

    /**
     * 按单一条件查询地址信息:id,customerId,province,city,country,road
     *
     * @param address
     * @return
     */
    @Override
    public List<Address> searchAddress(Address address) {
        checkAddress(address);
        return addressDao.query(address);
    }
    private void  checkAddress(Address address){
        if (address == null) {
            throw new NullPointerException("地址信息不能为空");
        }else{
        	System.out.println();
		}
        
    }
}
