/**
 * Copyright (C), 2015-2017
 * FileName: CustomerController
 * Author:   dell
 * Date:     2017/12/26 10:17
 * Description:
 */
package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dell on 2017/12/26.
 * 从前端传入数据
 */
@Controller
public class GetDataFromJSController {
    @RequestMapping(value = "/getInfo/{name}/{age}",method = RequestMethod.GET)
    public String  getCustomer(@PathVariable String name,@PathVariable int age){
        System.out.println(name);
        System.out.println(age);
        return "cc";
    }
}
