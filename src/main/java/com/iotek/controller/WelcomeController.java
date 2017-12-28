/**
 * Copyright (C), 2015-2017
 * FileName: WelcomeController
 * Author:   dell
 * Date:     2017/12/25 10:12
 * Description:
 */
package com.iotek.controller;

import com.iotek.po.Address;
import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dell on 2017/12/25.
 * 将数据传到视图
 */
@Controller
public class WelcomeController {
    //自动装配成bean
    @Autowired
    private  CustomerService customerService;
    private Customer customer;
    //1.通过map方法,返回视图名,当次请求
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String welcome(HashMap<String,Object> hashMap){
        customer = new Customer();
        customer.setCustomerName("lxj");
        customer.setCustomerPassword("123");

        customer = customerService.login(customer);
        /*返回的结果是一个数据或试图的名字*/
        return "welcome";
    }

    //2.通过model方法，返回视图名，当次请求
    @RequestMapping(value = "/showInfor.view" ,method = RequestMethod.GET)
    public String welcome(Model model){
        if (customer == null) {
            model.addAttribute("infor","用户信息没找到。") ;
            return "error";
        }
        model.addAttribute("customer",customer);
        return "success";
    }

    //3.通过modelAndView方法，当次请求
    @RequestMapping(value = "/showAddress.view",method = RequestMethod.GET)
    public ModelAndView welcome(ModelAndView modelAndView){
        List<Address> addressList = customer.getAddressList();
        if (null == addressList||addressList.size()==0) {
            modelAndView.addObject("infor","抱歉，用户还没有地址信息。");
            modelAndView.setViewName("error");
        }else {
            modelAndView.addObject("addressList", addressList);
            modelAndView.setViewName("success");
        }
        return modelAndView;
    }
    //4.通过session 方法，当次会话
    @RequestMapping(value = "/showCustomer.view",method = RequestMethod.GET)
    public String welcome(Model model, HttpSession session){
        if(customer==null){
            model.addAttribute("infor","用户信息为空");
            return "error";
        }
        session.setAttribute("customer",customer);
        return "customerInfor";
    }
    @RequestMapping(value = "/checkSession.view",method = RequestMethod.GET)
    public String checkSession(){
        return "checkSession";
    }

}
