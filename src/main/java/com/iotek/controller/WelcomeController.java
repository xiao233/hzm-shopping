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
 * �����ݴ�����ͼ
 */
@Controller
public class WelcomeController {
    //�Զ�װ���bean
    @Autowired
    private  CustomerService customerService;
    private Customer customer;
    //1.ͨ��map����,������ͼ��,��������
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String welcome(HashMap<String,Object> hashMap){
        customer = new Customer();
        customer.setCustomerName("lxj");
        customer.setCustomerPassword("123");

        customer = customerService.login(customer);
        /*���صĽ����һ�����ݻ���ͼ������*/
        return "welcome";
    }

    //2.ͨ��model������������ͼ������������
    @RequestMapping(value = "/showInfor.view" ,method = RequestMethod.GET)
    public String welcome(Model model){
        if (customer == null) {
            model.addAttribute("infor","�û���Ϣû�ҵ���") ;
            return "error";
        }
        model.addAttribute("customer",customer);
        return "success";
    }

    //3.ͨ��modelAndView��������������
    @RequestMapping(value = "/showAddress.view",method = RequestMethod.GET)
    public ModelAndView welcome(ModelAndView modelAndView){
        List<Address> addressList = customer.getAddressList();
        if (null == addressList||addressList.size()==0) {
            modelAndView.addObject("infor","��Ǹ���û���û�е�ַ��Ϣ��");
            modelAndView.setViewName("error");
        }else {
            modelAndView.addObject("addressList", addressList);
            modelAndView.setViewName("success");
        }
        return modelAndView;
    }
    //4.ͨ��session ���������λỰ
    @RequestMapping(value = "/showCustomer.view",method = RequestMethod.GET)
    public String welcome(Model model, HttpSession session){
        if(customer==null){
            model.addAttribute("infor","�û���ϢΪ��");
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
