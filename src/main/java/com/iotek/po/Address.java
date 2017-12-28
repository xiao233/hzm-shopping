/**
 * Copyright (C), 2015-2017
 * FileName: Address
 * Author:   dell
 * Date:     2017/11/12 11:26
 * Description:
 */
package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by dell on 2017/11/12.
 */
public class Address implements Serializable{
    private Long id;
    private String province;
    private String city;
    private String country;
    private String road;
    private Long customerId;
    private Timestamp addressCreateTime;

    public Address() {
    }

    public Address(String province, String city, String country, String road, Long customerId) {
        this.province = province;
        this.city = city;
        this.country = country;
        this.road = road;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Timestamp getAddressCreateTime() {
        return addressCreateTime;
    }

    public void setAddressCreateTime(Timestamp addressCreateTime) {
        this.addressCreateTime = addressCreateTime;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", road='" + road + '\'' +
                ", customerId=" + customerId +
                ", addressCreateTime=" + addressCreateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!province.equals(address.province)) return false;
        if (!city.equals(address.city)) return false;
        if (!country.equals(address.country)) return false;
        if (!road.equals(address.road)) return false;
        return customerId.equals(address.customerId);

    }

    @Override
    public int hashCode() {
        int result = province.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + road.hashCode();
        result = 31 * result + customerId.hashCode();
        return result;
    }
}
