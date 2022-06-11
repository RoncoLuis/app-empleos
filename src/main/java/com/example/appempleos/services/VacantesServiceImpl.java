package com.example.appempleos.services;

import com.example.appempleos.model.Vacante;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class VacantesServiceImpl implements IVacanteService{
    
    private List<Vacante> listaVacantes = null; 
    @Override
    public List<Vacante> listarVacantes() {
        Date now = new Date();
        listaVacantes = new ArrayList<>();
        listaVacantes.add(new Vacante(21,"Ingeniero en sistemas","Desarrollo de sistemas con java",now,2500.00,1));
        listaVacantes.add(new Vacante(22,"Medico veterinario","Clinica de perros y gatos",now,6500.00,0));
        listaVacantes.add(new Vacante(23,"Ingeniero Industrial","Desarrollo procesos son energia sustentable",now,12500.00,1));
        listaVacantes.add(new Vacante(24,"Fisioterapeuta","Fisioterapia de adultos mayores",now,5500.00,0));
        return listaVacantes;
    }
}
