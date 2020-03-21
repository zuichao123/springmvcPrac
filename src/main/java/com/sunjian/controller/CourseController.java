package com.sunjian.controller;

import com.sunjian.entity.Course;
import com.sunjian.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sunjian
 * @date 2020/3/20 14:34
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping("/add")
    public String add(Course course){
        courseRepository.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        courseRepository.deleteById(id);
        return "redirect:/course/findAll";
    }

    @PutMapping("/update")
    public String update(Course course){
        courseRepository.saveOrUpdate(course);
        return "redirect:/course/findAll";
    }

    @GetMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("showCourse");
        modelAndView.addObject("list", courseRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView("updateCourse");
        modelAndView.addObject("course", courseRepository.findId(id));
        return modelAndView;
    }
}
