package com.example.appempleos.services;

import com.example.appempleos.model.Vacante;

import java.util.List;

public interface IVacanteService {
    public List<Vacante> listarVacantes();
    public List<Vacante> listaDescatados();
    public Vacante buscarPorId(Integer vacanteId);
}
