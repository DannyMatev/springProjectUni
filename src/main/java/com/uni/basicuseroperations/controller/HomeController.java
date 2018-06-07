package com.uni.basicuseroperations.controller;

import com.uni.basicuseroperations.repository.UserRepository;
import com.uni.basicuseroperations.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping
public class HomeController {

    private UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");

        return modelAndView;
    }

    @GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("redirect:login");
        request.getSession().setAttribute("user", null);
        request.getSession().invalidate();

        return modelAndView;
    }

    @RequestMapping("/register")
    public ModelAndView registration(Model model) {
        ModelAndView modelAndView = new ModelAndView("registration");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            return new ModelAndView("forward:/home");
        }

        String userExistsError = (String) model.asMap().get("user_exists_error");
        modelAndView.addObject("user_exists_error", userExistsError);

        return modelAndView;
    }

    @PostMapping("/register")
    public RedirectView registration(@RequestParam(value = "email") String email,
                                     @RequestParam(value = "password") String password,
                                     @RequestParam(value = "gender") String gender,
                                     RedirectAttributes redirectAttrs) {
        RedirectView redirectView = new RedirectView("/register");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            return new RedirectView("forward:/home");
        }

        if(!userService.registerUser(email, password, gender)) {
            redirectAttrs.addFlashAttribute("user_exists_error", "User with that email already exists");
        }

        return redirectView;
    }

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            return new ModelAndView("forward:/home");
        }

        return modelAndView;
    }
}
