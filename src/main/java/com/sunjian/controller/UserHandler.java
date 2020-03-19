package com.sunjian.controller;

import com.sunjian.entity.User;
import com.sunjian.entity.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sunjian
 * @date 2020/3/17 14:28
 */
@Controller
@RequestMapping(value = "/user")
public class UserHandler {
    @RequestMapping(value = "/add")
    public String add(User user){
        System.out.println(user);
        return "index";
    }

    @RequestMapping(value = "/listUser")
    @ResponseBody
    public String listUser(UserList userList){
        for(User user:userList.getUsers()){
            System.out.println(user);
        }
        return "ok";
    }

    @RequestMapping(value = "/arrayUser")
    @ResponseBody
    public String arrayUser(@RequestBody String[] names){
        for(String s:names){
            System.out.print(s + " ");
        }
        return names.toString();
    }

    @RequestMapping(value = "/package")
    @ResponseBody
    public String packageTest(Integer num){
        return "num: " + num;
    }

    @RequestMapping(value = "/int/{num}")
    @ResponseBody
    public String intTest(@PathVariable int num){
        return "num: " + num;
    }
}
