/**
 * Copyright (C), 2015-2017
 * FileName: OrderItem
 * Author:   dell
 * Date:     2017/11/25 17:32
 * Description: 子订单实体类
 */
package po;

import java.io.Serializable;

/**
 * Created by dell on 2017/11/25.
 */
public class OrderItem implements Serializable , Comparable<OrderItem>{
    public static  final int IS_SEND = 1;
    public static  final int IS_NO_SEND = 0;//没有发货
    public static  final int IS_WELL = 1;
    public static  final int IS_NO_WELL = 0;//未签收
    private Long id;
    private Long itemNo;
    private Long orderListId;
    private Long productId;
    private Integer productNumber;
    private Integer isSendOut;
    private Long addressId;
    private Integer orderItemState;
    private Product product;
    private Address address;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long itemNo) {
        this.itemNo = itemNo;
    }

    public Long getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Long orderListId) {
        this.orderListId = orderListId;
    }

    public Integer getIsSendOut() {
        return isSendOut;
    }

    public void setIsSendOut(Integer isSendOut) {
        this.isSendOut = isSendOut;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getOrderItemState() {
        return orderItemState;
    }

    public void setOrderItemState(Integer orderItemState) {
        this.orderItemState = orderItemState;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", itemNo=" + itemNo +
                ", orderListId=" + orderListId +
                ", productId=" + productId +
                ", productNumber=" + productNumber +
                ", isSendOut=" + isSendOut +
                ", addressId=" + addressId +
                ", orderItemState=" + orderItemState +
                '}';
    }

    @Override
    public int compareTo(OrderItem o) {
        return o.getItemNo().compareTo(itemNo);
    }
}
