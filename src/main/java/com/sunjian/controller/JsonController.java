package com.sunjian.controller;

import com.sunjian.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunjian
 * @date 2020/3/17 15:51
 */
@Controller
public class JsonController {
    @RequestMapping(value = "/json")
    @ResponseBody
    public String json(@RequestBody User user){
        System.out.println(user);
        return user.toString();
    }
}
