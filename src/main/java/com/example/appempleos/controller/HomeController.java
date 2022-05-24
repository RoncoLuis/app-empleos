package com.example.appempleos.controller;

import com.example.appempleos.model.Vacante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//@RestController with RestController we cannot return a view
@Controller //we can return an html view
public class HomeController {

    @GetMapping("/detalle-vacantes")
    public String detalleVacante(Model model){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        List<Vacante> detalleVacantes = new ArrayList<>();
        detalleVacantes.add(new Vacante(21,"Ingeniero en sistemas","Desarrollo de sistemas con java",now,2500.00));
        detalleVacantes.add(new Vacante(22,"Medico veterinario","Clinica de perros y gatos",now,6500.00));
        detalleVacantes.add(new Vacante(23,"Ingeniero Industrial","Desarrollo procesos son energia sustentable",now,12500.00));
        detalleVacantes.add(new Vacante(24,"Fisioterapeuta","Fisioterapia de adultos mayores",now,5500.00));
        model.addAttribute("listaVacantes",detalleVacantes);
        model.addAttribute("sdf",sdf);
        return "detalle-vacante";
    }

    @GetMapping("/listar-empleos")
    public String mostrarListado(Model model){
        List<String> listaEmpleos = new LinkedList<String>();
        listaEmpleos.add("Ingeniero en sistemas");
        listaEmpleos.add("Veterinaria");
        listaEmpleos.add("Ingeniero industrial");
        listaEmpleos.add("Fisioterapeuta");

        model.addAttribute("listaEmpleos",listaEmpleos);
        return "empleos";
    }
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
