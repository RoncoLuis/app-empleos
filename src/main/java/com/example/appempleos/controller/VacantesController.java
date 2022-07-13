package com.example.appempleos.controller;

import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IVacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomBooleanEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
    //mostrando errores del registro en la vista del usuario agregando el obj del modelo
    @GetMapping(path = "/crear-vacante")
    public String formularioVacante(Vacante vacante) {
        return "vacantes/form-vacante";
    }

    //este método ejecuta la accion para que el formulario para guarde la nueva vacante
    @PostMapping("/crearVacante")
    public String crearNuevaVacante(Vacante vacante, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        //BindingResult permite manejar errores de tipo de dato !IMPORTANTE! debe estar justo despues del modelo
        if(bindingResult.hasErrors()){
            for(ObjectError error: bindingResult.getAllErrors()){
                System.out.println("Ocurrio un error "+ error.getDefaultMessage());
            }
            return "vacantes/form-vacante";
        }
        iVacanteService.guardarVacante(vacante);
        redirectAttributes.addFlashAttribute("msg", "Registo Guardado con Éxito");
        return "redirect:/lista-vacantes";
    }

    //este metodo funciona para darle formato a los elementos date
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        //el parametro true/false indica que la fecha puede o no ser nula
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,false));
    }

    //Old code: Ejemplo para obtener elementos especificos de un formulario
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
