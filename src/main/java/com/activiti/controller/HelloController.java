package com.activiti.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView index(ModelMap map) {
        ModelAndView modelAndView = new ModelAndView("index");
        map.put("host", "http://www.baidu.com");
//        modelAndView.setView(new Vi);
        return modelAndView;
    }

}
