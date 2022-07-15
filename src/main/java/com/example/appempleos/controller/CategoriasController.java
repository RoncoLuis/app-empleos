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
    public String crear() {
        return "categorias/formCategoria";
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion) {
        //los argumentos del @RequestParam coinciden con atributo name en formCategoria
        System.out.println("Nombre de la categoria:"+nombre);
        System.out.println("Descripcion:"+descripcion);
        Categoria categoria = new Categoria();
        categoria.setNombreCategoria(nombre);
        categoria.setDescripcionCategoria(descripcion);
        iCategoriaService.guardarCategoria(categoria);
        return "redirect:/categoria/index";
    }
}
