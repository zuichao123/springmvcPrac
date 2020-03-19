package com.sunjian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @author sunjian
 * @date 2020/3/18 9:24
 */
@Controller
@RequestMapping("/converter")
public class ConverterHandler {

    @RequestMapping("/date")
    public ModelAndView dateConverter(Date date){
        System.out.println(date);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("date", date);
        modelAndView.setViewName("converter");
        return modelAndView;
    }
}
