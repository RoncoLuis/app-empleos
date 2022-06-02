package com.example.appempleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/vacantes")
public class VacantesController {

    @GetMapping(path = "/view/{id}")
    public String verDetalle(@PathVariable(name = "id") int id, Model model){
        System.out.println("El id de la vacante es: "+id);
        model.addAttribute("idVacante",id);
        return "vacantes/detalle-vacante";
    }

    @GetMapping(path = "/eliminar-vacante")
    public String eliminarVacante(@RequestParam(name = "id") int idVacante, Model model){
        System.out.println("Se eliminara la vacante con el id: "+ idVacante);
        model.addAttribute("idVacante",idVacante);
        return "vacantes/mensaje-eliminar";
    }

    @GetMapping(path = "/crear-vacante")
    public String crearVacante(){
        return "vacantes/form-vacante";
    }

}
