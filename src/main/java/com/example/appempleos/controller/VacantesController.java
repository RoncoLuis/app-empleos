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
    //Old - No se usara, ahora solo vacantes/detalle-vacantes
    public String verDetalle(@PathVariable(name = "id") int id, Model model) {
        // 1. Recuperamos el objeto completo
        Vacante vacanteSelected = iVacanteService.buscarPorId(id);
        //2. Pasamos a la vista el objeto completo
        model.addAttribute("vacante", vacanteSelected);

        return "vacantes/detalle-vacante";
    }

    @GetMapping(path = "/eliminar-vacante")
    public String eliminarVacante(@RequestParam(name = "id") int idVacante, Model model) {
        System.out.println("Se eliminara la vacante con el id: " + idVacante);
        model.addAttribute("idVacante", idVacante);
        return "vacantes/mensaje-eliminar";
    }

    @GetMapping(path = "/crear-vacante")
    public String formularioVacante() {
        //formulario para crear una vacante nueva
        return "vacantes/form-vacante";
    }

    @PostMapping("/crearVacante")
    public String crearNuevaVacante(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion,
                                    @RequestParam("categoria") String categoria, @RequestParam("estatus") String estatus,
                                    @RequestParam("fecha") String fecha, @RequestParam("destacado") String destacado,
                                    @RequestParam("salario") String salario, @RequestParam("detalles") String detalles) {

        System.out.println("=== Vacante ===");
        System.out.println("Nombre vacante: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("categoria: " + categoria);
        System.out.println("estatus: " + estatus);
        System.out.println("fecha: " + fecha);
        System.out.println("destacado: " + destacado);
        System.out.println("salario: " + salario);
        System.out.println("detalles:" + detalles);

        return "vacantes/form-vacante";
    }


}
