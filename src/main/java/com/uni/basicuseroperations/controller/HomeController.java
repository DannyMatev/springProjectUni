package com.uni.basicuseroperations.controller;

import com.uni.basicuseroperations.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");

        return modelAndView;
    }
}
