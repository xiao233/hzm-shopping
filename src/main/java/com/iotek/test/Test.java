/**
 * Copyright (C), 2015-2017
 * FileName: Test
 * Author:   dell
 * Date:     2017/12/21 9:47
 * Description:
 */
package com.iotek.test;

import com.iotek.po.*;
import com.iotek.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by dell on 2017/12/21.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        AddressService addressService = (AddressService) context.getBean("addressService");
        Address address = new Address();
        address.setProvince("����ʡ");
        address.setCity("�Ͼ���");
        address.setCountry("������");
        address.setRoad("�Ϻ�");
        address.setCustomerId(3L);
        //addressService.addAddress(address);

        OrderListService orderListService = (OrderListService) context.getBean("orderListService");
        OrderList orderList = new OrderList();
        orderList.setCustomerId(3L);
        orderList.setOrderState("��������ʧЧ��");
        //orderListService.addOrderList(orderList);

        OrderItemService orderItemService = (OrderItemService) context.getBean("orderItemService");
        OrderItem orderItem = new OrderItem();
        orderItem.setItemNo(171224000300320030L);
        orderItem.setOrderListId(32L);
        orderItem.setProductId(30L);
        orderItem.setAddressId(31L);
        orderItem.setProductNumber(10);
        //orderItemService.addOrderItem(orderItem);


        ProductStockService productStockService = (ProductStockService) context.getBean("productStockService");
        ProductStock productStock = new ProductStock();
        productStock.setProductId(30L);
        productStock.setStockNumber(100);
        //productStockService.addProductStock(productStock);

        ProductShelfService productShelfService = (ProductShelfService) context.getBean("productShelfService");
        ProductShelf productShelf = new ProductShelf();
        productShelf.setProductId(30L);
        //productShelfService.addProductShelf(productShelf);

        InnerStockService innerStockService = (InnerStockService) context.getBean("innerStockService");
        InnerStock innerStock = new InnerStock();
        innerStock.setProductId(30L);
        innerStock.setInnerStockNumber(2);
        //innerStockService.addInnerStock(innerStock);
        System.out.println(innerStockService.searchInnerStock(innerStock).get(0).getProduct());

        OuterStockService outerStockService = (OuterStockService) context.getBean("outerStockService");
        OuterStock outerStock = new OuterStock();
        outerStock.setProductId(30L);
        outerStock.setOuterStockNumber(2);
        //outerStockService.addOuterStock(outerStock);
        System.out.println(outerStockService.searchOuterStock(outerStock));

        CustomerService dataSource = (CustomerService) context.getBean("customerService");
        Customer customer = new Customer();
        customer.setCustomerName("lxj");
        customer.setCustomerPassword("123");
        customer= dataSource.login(customer);
        System.out.println(customer);//�û�
        List<Address> addressList = customer.getAddressList();
        show(addressList);//��ַ
        List<OrderList> orderLists = customer.getOrderLists();
        show(orderLists);//�󶩵�
        OrderList orderList1 = orderLists.get(2);
        List<OrderItem> orderItems = orderList1.getOrderItems();
        show(orderItems);//С����
        OrderItem orderItem1 = orderItems.get(0);
        System.out.println(orderItem1.getProduct());//��Ʒ
        System.out.println(orderItem1.getAddress());//��ַ
        Product product = orderItem1.getProduct();
        System.out.println(product.getProductDetail());//��Ʒ����
        System.out.println(product.getProductStock());//��Ʒ���
        System.out.println(product.getProductShelf());//��Ʒ�ϼ�
    }
    public static <T> void  show(List<T> list){
        for (T t : list) {
            System.out.println(t);
        }

    }
}
