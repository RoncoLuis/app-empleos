package com.example.appempleos.controller;

import com.example.appempleos.model.Reclutador;
import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IEmpleosService;
import com.example.appempleos.services.IReclutadorService;
import com.example.appempleos.services.IVacanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//@RestController with RestController we cannot return a view
@Controller //we can return an html view
public class HomeController {

    @Autowired
    private IVacanteService iVacanteService;
    @Autowired
    private IReclutadorService iReclutadorService;
    @Autowired
    private IEmpleosService iEmpleosService;

    @GetMapping("/nuestros-reclutadores")
    public String getReclutadores(Model model){
        List<Reclutador> listaReclutador = iReclutadorService.listarReclutadores();
        model.addAttribute("listaReclutadores",listaReclutador);
        return "nuestros-reclutadores";
    }

    @GetMapping("/detalle-vacantes")
    public String detalleVacante(Model model){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        List<Vacante> detalleVacantes = iVacanteService.listarVacantes();
        model.addAttribute("listaVacantes",detalleVacantes);
        model.addAttribute("sdf",sdf);
        return "detalle-vacante";
    }

    @GetMapping("/listar-empleos")
    public String mostrarListado(Model model){
        List<String> listaEmpleos = iEmpleosService.listaEmpleos();
        model.addAttribute("listaEmpleos",listaEmpleos);

        return "empleos";
    }
    @GetMapping("/")
    public String home(Model model){
        String tituloPagina = "Página principal buscaEmpleoApp";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaPub = new Date();

        model.addAttribute("tituloPagina", tituloPagina);
        model.addAttribute("fechaPublicacion", fechaPub);

        return "home";
    }
}
