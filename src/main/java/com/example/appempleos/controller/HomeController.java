package com.example.appempleos.controller;

import com.example.appempleos.model.Reclutador;
import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IVacanteService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IVacanteService iVacanteService;
    @GetMapping("/nuestros-reclutadores")
    public String getReclutadores(Model model){
        List<Reclutador> listaReclutador = new ArrayList<Reclutador>();
        listaReclutador.add(new Reclutador("Elisa","Cabana",'F',"Reclutador Dpto. Estadistica",true,"facebook"));
        listaReclutador.add(new Reclutador("Stephan","Mareek",'M',"Reclutador AWS",true,"amazon"));
        listaReclutador.add(new Reclutador("John","Thompson",'M',"Reclutador TI",true,"airbnb"));
        listaReclutador.add(new Reclutador("Mariana","Ortiz",'F',"Reclutador RH",false,"netflix"));
        listaReclutador.add(new Reclutador("Ivan","Tinajero",'M',"Reclutador TI",true,"google"));
        listaReclutador.add(new Reclutador("Chad","Darby",'M',"Reclutador Java",false,"java"));
        model.addAttribute("listaReclutadores",listaReclutador);
        return "nuestros-reclutadores";
    }

    @GetMapping("/detalle-vacantes")
    public String detalleVacante(Model model){
        //los dato vienen de la implementacion VacantesServiceImpl
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Vacante> detalleVacantes = iVacanteService.listarVacantes();
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
