/**
 * Copyright (C), 2015-2017
 * FileName: CustomerController
 * Author:   dell
 * Date:     2017/12/26 11:18
 * Description:
 */
package com.iotek.controller;

import com.iotek.po.Customer;
import com.iotek.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by dell on 2017/12/26.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "/mainMenu.view",method = RequestMethod.GET)
    public String index(HttpServletRequest request,
                        HttpSession session){
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "customer/login";
        }
        String customerName=null;
        String customerPassword=null;
        //��ȡcookies������û���Ϣ
        for (Cookie cookie : cookies) {
            if (cookie != null&&"customerName".equals(cookie.getName())) {
                customerName=cookie.getValue();
            }
            if (cookie != null&&"customerPassword".equals(cookie.getName())) {
                customerPassword=cookie.getValue();
            }
        }
        //�ж��û���Ϣ�Ƿ�Ϊ��
        if (customerName == null||customerPassword==null) {
            return "customer/login";
        }
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setCustomerPassword(customerPassword);
        //��֤�û���Ϣ�Ƿ����
        customer = customerService.login(customer);
        if (customer == null) {
            return "customer/login";
        }
        session.setAttribute("customer",customer);
        return "customer/customerMainMenu";
    }
    @RequestMapping(value = "/login.view",method = RequestMethod.GET)
    public String login(){
        return "customer/login";
    }
    /**
     * �û���¼
     * @param model
     * @param httpSession
     * @param response
     * @param request
     * @param customer
     * @return
     */
    @RequestMapping(value = "/login.do",method = {RequestMethod.POST,RequestMethod.GET})
    public String login(Model model,
                        HttpSession httpSession,
                        HttpServletResponse response,
                        HttpServletRequest request,
                        @ModelAttribute  Customer customer){

        //�ж��û���Ϣ�Ƿ�Ϊ��
        if (customer.getCustomerName() == null||customer.getCustomerPassword()==null) {
            return "customer/login";
        }
        customer = customerService.login(customer);

        if (customer == null) {
            model.addAttribute("info","fail");
            return "customer/login";
        }

        //�������˼�ס���룬�����û���Ϣ��cookie
        if(request.getParameter("remember")!=null){
            System.out.println(request.getParameter("remember"));
            Cookie name = new Cookie("customerName",customer.getCustomerName());
            //����cookie���ʱ��
            name.setMaxAge(1*60*60*24);
            name.setPath("/");
            //��cookie���浽��Ӧ
            response.addCookie(name);
            Cookie password = new Cookie("customerPassword",customer.getCustomerPassword());
            password.setMaxAge(1*60*60*24);
            password.setPath("/");
            response.addCookie(password);
        }
        httpSession.setAttribute("customer",customer);
        return "customer/customerMainMenu";
    }
    @RequestMapping(value = "/register.view",method = RequestMethod.GET)
    public String register(){
        return "customer/register";
    }

    /**
     *
     * @param customer
     * @param model
     * @return
     */
    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public String register(@ModelAttribute Customer customer,
                           Model model){
        boolean b = customerService.addCustomer(customer);
        model.addAttribute("customerName",customer.getCustomerName());
        if(b){
            model.addAttribute("info","registerSuccess");
            return "customer/login";
        }
        model.addAttribute("info","registerFail");
        return "customer/register";
    }

    /**
     * �˳�ϵͳ��ע��session��cookie
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "/exitProgram.do")
    public String exitProgram(HttpServletRequest request,
                              HttpServletResponse response,
                              Model model){
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("customer");
        //��session����û���û���Ϣ���򷵻�������
        if (customer == null) {
            return "customer/login";
        }
        Cookie[] cookies = request.getCookies();
        //ʹ������cookie������û���ϢʧЧ
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie != null&&"customerName".equals(cookie.getName())) {
                    cookie.setMaxAge(0);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                }
                if (cookie != null&&"customerPassword".equals(cookie.getName())) {
                    cookie.setMaxAge(0);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                }
            }
        }

        //�����λỰsessionʧЧ
        session.invalidate();
        model.addAttribute("customer",customer);
        model.addAttribute("exit","success");
        return "customer/login";
    }

    /**
     * ��֤�û��������䡢�����Ƿ�ע��
     * @param request
     * @return
     */
    @RequestMapping(value = "/checkInfo.do",method = RequestMethod.GET)
    public @ResponseBody String checkName(HttpServletRequest request){
        Customer customer = new Customer();
        String param = request.getParameter("param").trim();
        String type = request.getParameter("type").trim();
        String str = type;
        if("name".equals(type)){
            customer.setCustomerName(param);
        }else if("email".equals(type)){
            customer.setCustomerEmail(param);
        }else if("phone".equals(type)){
            customer.setCustomerPhone(param);
        }
        List<Customer> list = customerService.searchCustomer(customer);
        if (list.size()>0) {
            return type+"has";
        }
        return type+"noHas";
    }
}
