package com.uni.basicuseroperations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }


    @RequestMapping("/registration")
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView("registration");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
}
