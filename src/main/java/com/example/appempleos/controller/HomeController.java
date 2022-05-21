package com.example.appempleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController with RestController we cannot return a view
@Controller //we can return an html view
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("mensaje","Hola Thymeleaf");
        model.addAttribute("fecha", new java.util.Date());
        return "home";
    }
}
