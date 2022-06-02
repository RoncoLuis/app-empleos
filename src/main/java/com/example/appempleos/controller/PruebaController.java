package com.example.appempleos.controller;

import com.example.appempleos.model.Reclutador;
import com.example.appempleos.services.IPrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/prueba")
public class PruebaController {

    @Autowired
    private IPrueba iPrueba;

    @GetMapping("/home")
    public String pruebaHome(){
        List<Reclutador> lista = iPrueba.listReclutador();
        for (int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        return "prueba-home";
    }
}
