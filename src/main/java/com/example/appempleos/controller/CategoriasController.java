package com.example.appempleos.controller;

import com.example.appempleos.model.Categoria;
import com.example.appempleos.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="/categoria")
public class CategoriasController {

    @Autowired
    private ICategoriaService iCategoriaService;

    @GetMapping(path = "/{mi-variable}")
    public String muestraVariable(@PathVariable("mi-variable") String miVariable, Model model){
        System.out.println("esta es mi variable: "+miVariable);
        model.addAttribute("miVariable",miVariable);
        return "categorias/muestra-variable";
    }

    @GetMapping(path = "/index")
    public String mostrarIndex(Model model) {
        List<Categoria> categoriasList = iCategoriaService.buscarTodas();
        model.addAttribute("categoriasList", categoriasList);
        return "categorias/listCategorias";
    }

    @GetMapping(path = "/create")
    public String crear(Categoria categoria) {
        return "categorias/formCategoria";
    }

    @PostMapping(path = "/save")
    public String guardar(Categoria categoria) {
        //Nota: Agregar el objeto categoria al metodo crear arreglo el problema del binding en este metodo.
        System.out.println("Nombre de la categoria:" + categoria.getNombreCategoria());
        System.out.println("Descripcion:" + categoria.getDescripcionCategoria());
        iCategoriaService.guardarCategoria(categoria);

        return "redirect:/categoria/index";
    }
}
