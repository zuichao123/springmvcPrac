package com.sunjian.controller;

import com.sunjian.entity.Address;
import com.sunjian.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author sunjian
 * @date 2020/3/17 19:17
 */
@Controller
@RequestMapping("/view")
//@SessionAttributes(value = "user")
@SessionAttributes(types = User.class)
public class ViewController {
    @RequestMapping("/map")
    public String mapTest(Map<String, User> map){
        User user = new User();
        user.setId(7);
        user.setName("cronaldo");
        user.setAge(35);
        map.put("user", user);
        return "show";
    }

    @RequestMapping("/model")
    public String modelTest(Model model){
        User user = new User();
        user.setId(10);
        user.setName("meisi");
        user.setAge(33);
        model.addAttribute("user", user);
        return "show";
    }

    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        User user = new User();
        user.setId(8);
        user.setName("kaka");
        user.setAge(39);
        request.setAttribute("user", user);
        return "show";
    }

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        User user = new User();
        user.setId(77);
        user.setName("buFeng");
        user.setAge(41);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("show");
        return modelAndView;
    }

    @RequestMapping("/modelAndView2")
    public ModelAndView modelAndView2(){
        User user = new User();
        user.setId(77);
        user.setName("buFeng");
        user.setAge(41);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        View view = new InternalResourceView("/show.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }

    @RequestMapping("/modelAttribute")
    public String modelAttribute(){
        return "show";
    }
    @ModelAttribute
    public User getUser(){
        User user = new User();
        user.setId(123);
        user.setName("sunjian");
        user.setAge(32);
        return user;
    }
    @ModelAttribute
    public void getUser2(Model model){
        User user = new User();
        user.setId(124);
        user.setName("sunjian3");
        user.setAge(33);
        model.addAttribute("user", user);
    }
    @ModelAttribute
    public void getUser3(Map<String, User> map){
        User user = new User();
        user.setId(125);
        user.setName("sunjia4");
        user.setAge(34);
        map.put("user", user);
    }

    @RequestMapping("/session")
    public String session(HttpServletRequest request){
        User user = new User();
        user.setId(9);
        user.setName("sunjian9");
        user.setAge(29);
        request.getSession().setAttribute("user", user);
        return "show2";
    }
    @RequestMapping("/session2")
    public String session2(HttpSession session){
        User user = new User();
        user.setId(8);
        user.setName("sunjian10");
        user.setAge(28);
        session.setAttribute("user", user);
        return "show2";
    }

    @RequestMapping("/session3")
    public ModelAndView session2(){
        User user = new User();
        user.setId(007);
        user.setName("sunjian007");
        user.setAge(27);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("show2");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
