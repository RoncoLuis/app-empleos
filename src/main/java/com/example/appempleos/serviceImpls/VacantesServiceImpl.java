package com.example.appempleos.serviceImpls;

import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IVacanteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VacantesServiceImpl implements IVacanteService {
    
    private List<Vacante> listaVacantes = new ArrayList<Vacante>();
    @Override
    public List<Vacante> listarVacantes() {

        return listaVacantes;
    }

    @Override
    public List<Vacante> listaDescatados() {
        List<Vacante> listarVacantes = listarVacantes();
        List<Vacante> listaDestacados = null;
        for(int i=0; i<listarVacantes.size(); i++){
            if(listarVacantes.get(i).getVacanteDestacada() == 1){
                listaDestacados.add(listarVacantes.get(i));
            }
        }

        return listaDestacados;
    }

    @Override
    public Vacante buscarPorId(Integer vacanteId) {
        //1. iterar lista
        //2. definir condicion de busqueda
        //3. retornar el objeto
        for(Vacante v : listaVacantes){
            if(v.getIdVacante() == vacanteId){
                return v;
            }
        }
        // retornar null si no se encuentra la vacante en lista
        return null;
    }

    @Override
    public void guardarVacante(Vacante vacante) {
        System.out.println("=== Vacante ===");
        System.out.println("Nombre vacante: " + vacante.getNombreVacante());
        System.out.println("Descripcion: " + vacante.getDescripcion());
        System.out.println("fecha: " + vacante.getFechaPublicacion());
        System.out.println("destacado: " + vacante.getVacanteDestacada());
        System.out.println("salario: " + vacante.getSalario());
        listaVacantes.add(vacante);
    }
}
