package com.antra.phonepad.combination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping({"/index","/"})
    public String hello(){
        return "index";
    }
}
