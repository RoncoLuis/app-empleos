package com.example.appempleos.controller;

import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IVacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/vacantes")
public class VacantesController {

    @Autowired
    private IVacanteService iVacanteService;
    @GetMapping(path = "/view/{id}")
    public String verDetalle(@PathVariable(name = "id") int id, Model model){
        Vacante vacanteSelected = iVacanteService.buscarPorId(id);

        //pasar el objeto completo a la vista
        model.addAttribute("vacante",vacanteSelected);

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
