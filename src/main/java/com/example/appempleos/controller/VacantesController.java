package com.example.appempleos.controller;

import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IVacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    //este método te redirecciona al formulario para crear una vacante nueva
    @GetMapping(path = "/crear-vacante")
    public String formularioVacante() {
        return "vacantes/form-vacante";
    }

    //este método ejecuta la accion para que el formulario para guarde la nueva vacante
    @PostMapping("/crearVacante")
    public String crearNuevaVacante(Vacante vacante) {
        iVacanteService.guardarVacante(vacante);
        return "vacantes/form-vacante";
    }

    //este metodo funciona para darle formato a los elementos date
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //el parametro true/false indica que la fecha puede o no ser nula
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,false));
    }

   /* @PostMapping("/crearVacante")
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
    }*/
}
