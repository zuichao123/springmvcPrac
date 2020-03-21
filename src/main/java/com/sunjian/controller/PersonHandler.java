package com.sunjian.controller;

import com.sunjian.entity.Address;
import com.sunjian.entity.Person;
import com.sunjian.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * @author sunjian
 * @date 2020/3/21 21:03
 */
@Controller
@RequestMapping("/person")
public class PersonHandler {
    @GetMapping("/get")
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView();
        Person person = new Person();
        person.setId(1);
        person.setName("张三");
        person.setAge(22);
        person.setGender("男");
        person.setPassword("123123");
//        person.setFlag(true);

        String[] hobby = {"读书","看电影","旅行"};
        person.setHobby(hobby);

        List<String> hobby2 = new ArrayList<>();
        hobby2.add("打游戏");
        hobby2.add("旅行");

        person.setHobby2(hobby2);

        String[] hobbys = {"读书","看电影","打游戏","听音乐","旅行"};
        String[] selectHobbys = {"读书","打游戏","旅行"};

        person.setHobbys(hobbys);
        person.setSelectHobbys(selectHobbys);

        person.setHobbys2(Arrays.asList("读书","看电影","打游戏","听音乐","旅行"));
        person.setSelectHobbys2(Arrays.asList("读书","打游戏","旅行"));

        person.setRadioId(1);

        Map<Integer,String> gradeMap = new HashMap<>();
        gradeMap.put(1,"一年级");
        gradeMap.put(2,"二年级");
        gradeMap.put(3,"三年级");
        gradeMap.put(4,"四年级");
        gradeMap.put(5,"五年级");
        gradeMap.put(6,"六年级");
        person.setGradeMap(gradeMap);

        person.setSelectGrade(3);

        Map<Integer,String> cityMap = new HashMap<>();
        cityMap.put(1,"北京");
        cityMap.put(2,"上海");
        cityMap.put(3,"广州");
        cityMap.put(4,"深圳");
        person.setCityMap(cityMap);
        person.setSelectCity(3);

        person.setIntroduce("你好");

        Address address = new Address();
        address.setId(1);
        address.setName("科技路");
        person.setAddress(address);
        modelAndView.addObject("person",person);
        modelAndView.setViewName("person");
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student",new Student());
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @PostMapping("/login")
    public String reg(@Validated Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "login";
        }
        return "index";
    }

}
