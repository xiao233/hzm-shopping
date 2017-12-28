/**
 * Copyright (C), 2015-2017
 * FileName: CustomerService
 * Author:   dell
 * Date:     2017/11/8 13:43
 * Description: 用户类
 */
package po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by dell on 2017/11/8.
 */
public class Customer implements Serializable {
    public static final  Integer NOT_NORMAL=1;//不正常
    public static final  Integer NORMAL=0;

    private  Long id;
    private String customerName;
    private String customerPassword;
    private String customerPhone;
    private String customerEmail;
    private BigDecimal customerMoney;
    private Timestamp customerLoginTime;//最近登录时间
    private Timestamp customerCreateTime;//注册时间
    private Integer isNormal;//账号是否正常
    private List<Address> addressList;
    private List<OrderList> orderLists;

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<OrderList> getOrderLists() {
        return orderLists;
    }

    public void setOrderLists(List<OrderList> orderLists) {
        this.orderLists = orderLists;
    }

    public Customer() {
    }

    public Timestamp getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Timestamp customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public BigDecimal getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(BigDecimal customerMoney) {
        this.customerMoney = customerMoney;
    }

    public Timestamp getCustomerLoginTime() {
        return customerLoginTime;
    }

    public void setCustomerLoginTime(Timestamp customerLoginTime) {
        this.customerLoginTime = customerLoginTime;
    }

    public Timestamp getCustomeCreateTime() {
        return customerCreateTime;
    }

    public void setCustomeCreateTime(Timestamp customeCreateTime) {
        this.customerCreateTime = customeCreateTime;
    }

    public Integer getIsNormal() {
        return isNormal;
    }

    public void setIsNormal(Integer isNormal) {
        this.isNormal = isNormal;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerMoney=" + customerMoney +
                ", customerLoginTime=" + customerLoginTime +
                ", customerCreateTime=" + customerCreateTime +
                ", isNormal=" + isNormal +
                '}';
    }
}
