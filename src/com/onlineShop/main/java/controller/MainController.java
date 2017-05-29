package com.onlineShop.main.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloworld(ModelMap model){
        model.addAttribute("message1", "Hello WORLD!");
        return "hello";
    }
}

