package com.dragtotech.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ankit on 08-05-2016.
 */
@Controller
//@RequestMapping(value = {"/login", "/"})
public class LoginController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String showLoginForm(ModelMap model) {
        model.addAttribute("loginmessage", "Please Enter your details to login");
        return "login";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public ModelAndView submitLogin(@RequestParam("userid") String userid, @RequestParam("password") String password) {
        ModelAndView model = new ModelAndView();
        if (userid.equalsIgnoreCase("jason") && password.equals("Bourne")) {
            model.setViewName("home");
            model.addObject("user", userid);
        } else {
            model.setViewName("login");
            model.addObject("incorrectPassMsg", "Wrong username or password... Please Try Again!");
        }
        return model;
    }
}
