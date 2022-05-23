package com.example.appempleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

//@RestController with RestController we cannot return a view
@Controller //we can return an html view
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        //model.addAttribute("mensaje","Hola Thymeleaf");
       // model.addAttribute("fecha", new java.util.Date());
        String nombre = "Luis";
        String puesto = "Programador Jr.";
        Date fechaPub = new Date();
        double salario = 4500.00;
        boolean vigencia = true;

        model.addAttribute("nombre", nombre);
        model.addAttribute("puesto", puesto);
        model.addAttribute("fechaPublicacion", fechaPub);
        model.addAttribute("salario", salario);
        model.addAttribute("vigencia", vigencia);

        return "home";
    }
}
