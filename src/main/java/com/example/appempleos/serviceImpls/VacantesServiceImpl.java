package com.example.appempleos.serviceImpls;

import com.example.appempleos.model.Vacante;
import com.example.appempleos.services.IVacanteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VacantesServiceImpl implements IVacanteService {
    
    private List<Vacante> listaVacantes = null; 
    @Override
    public List<Vacante> listarVacantes() {
        Date now = new Date();
        listaVacantes = new ArrayList<>();
        listaVacantes.add(new Vacante(21,"Ingeniero en sistemas","logo1","Desarrollo de aplicaciones empresariales con Java 11",now,2500.00,1));
        listaVacantes.add(new Vacante(22,"Medico veterinario","logo2","Clinica de perros y gatos",now,6500.00,0));
        listaVacantes.add(new Vacante(23,"Ingeniero Industrial","logo3" ,"Desarrollo procesos con energia solar",now,12500.00,1));
        listaVacantes.add(new Vacante(24,"Fisioterapeuta","logo4","Fisioterapia en adultos mayores",now,5500.00,0));
        return listaVacantes;
    }

    @Override
    public List<Vacante> listaDescatados() {
        List<Vacante> listarVacantes = listarVacantes();
        List<Vacante> listaDestacados = null;
        for(int i=0; i<listarVacantes.size(); i++){
            if(listarVacantes.get(i).getDestacado() == 1){
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
            if(v.getId() == vacanteId){
                return v;
            }
        }
        // retornar null si no se encuentra la vacante en lista
        return null;
    }
}
