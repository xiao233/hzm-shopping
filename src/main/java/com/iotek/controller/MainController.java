/**
 * Copyright (C), 2015-2017
 * FileName: MainController
 * Author:   dell
 * Date:     2017/12/26 17:22
 * Description:
 */
package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dell on 2017/12/26.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String index(){
        return "mainMenu";
    }
}
