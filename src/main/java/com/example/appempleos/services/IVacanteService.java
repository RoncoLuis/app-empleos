package com.example.appempleos.services;

import com.example.appempleos.model.Vacante;

import java.util.List;

public interface IVacanteService {
    List<Vacante> listarVacantes();
    List<Vacante> listaDescatados();
    Vacante buscarPorId(Integer vacanteId);
    void guardarVacante(Vacante vacante);
}
