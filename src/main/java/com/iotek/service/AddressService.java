package com.iotek.service;

import com.iotek.po.Address;

import java.util.List;

/**
 * Created by dell on 2017/12/24.
 */
public interface AddressService {
    /**
     * ���ӵ�ַ��Ϣ
     * @param address
     * @return
     */
    boolean addAddress(Address address);

    /**
     * ����һ������ѯ��ַ��Ϣ
     * @param address
     * @return
     */
    List<Address> searchAddress(Address address);
}
