package com.sunjian.controller;

import com.sunjian.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sunjian
 * @date 2020/3/19 8:13
 */
@Controller
@RequestMapping("/rest")
public class RESTController {

    @RequestMapping("/get/{id}")
    @ResponseBody
    public String get(@PathVariable("id") int num){
        System.out.println("GET");
        if(num < 100){
            return "OK";
        }else
            return "没有这个编号的数据";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ModelAndView post(){
        User user = new User();
        user.setId(123);
        user.setName("post");
        user.setAge(55);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    @ResponseBody // 返回json格式
    public String put(){
        System.out.println("put");
        return "put";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(){
        System.out.println("delete");
        return "delete";
    }
}
