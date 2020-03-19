package com.sunjian.controller;

import com.sunjian.entity.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sunjian
 * @date 2020/3/18 10:31
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @RequestMapping("/addGoods")
    public ModelAndView addGoods(@RequestParam("goods") Goods goods){
        System.out.println(goods);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods", goods);
        modelAndView.setViewName("showGoods");
        return modelAndView;
    }
}
