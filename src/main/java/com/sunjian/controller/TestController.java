package com.sunjian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunjian
 * @date 2020/3/17 17:53
 */
@Controller
public class TestController {

    /**
     * 重定向
     */
    @RequestMapping(value = "/test1")
    public String testRedirect(){
        return "redirect:date.jsp";
    }

    /**
     * 转发
     */
    @RequestMapping(value = "/test2")
    public String testForward(){
        return "forward:date.jsp";
    }
    @RequestMapping(value = "/test3")
    public String test(){
        return "date";
    }
}
