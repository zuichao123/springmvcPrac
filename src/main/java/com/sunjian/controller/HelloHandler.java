package com.sunjian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunjian
 * @date 2020/3/17 10:06
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloHandler {

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
