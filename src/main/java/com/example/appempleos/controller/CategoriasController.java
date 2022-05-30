package com.example.appempleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {

    @GetMapping(path = "/{mi-variable}")
    public String muestraVariable(@PathVariable("mi-variable") String miVariable, Model model){
        System.out.println("esta es mi variable: "+miVariable);
        model.addAttribute("miVariable",miVariable);
        return "categorias/muestra-variable";
    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String mostrarIndex(Model model) {
        return "categorias/listCategorias";
    }

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String crear() {
        return "categorias/formCategoria";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String guardar() {
        return "categorias/listCategorias";
    }
}
